package snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

// Como Rect herda de Drawable, e esta última tem uma cor, não é mais necessário deixar esse atributo aqui.
public class Rect extends Drawable
{
	// Dando sentindo a um ponto numa coordenada. Para isso utilizamos a classe
	// "Point"
	private Point location;
	// Da mesma forma para fazer um retângulo, usaremos a classe Dimension.
	private Dimension dimension;
	
	public Rect(Point point, Dimension dimension)
	{
		this.location = point;
		this.dimension = dimension;
	}
	
	@Override public void draw(Graphics g)
	{
		// Como esse método abaixo espera um valor inteiro. Para contornar isso,
		// teremos
		// que fazer um casting do valor dos argumentos.
		g.fillRect((int) location.getX(), (int) location.getY(), (int) dimension.getWidth(),
				(int) dimension.getHeight());
	}
}
