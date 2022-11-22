package snake;

import java.awt.Color;
import java.awt.Graphics;

// Quando a implementação da classe só será usada quando usada pelas filhas, dizemos que essa classe é abstrata.
public abstract class Drawable
{
	private Color color;
	
	public Color getColor()
	{
		return color;
	}
	
	public Drawable()
	{
		color = Color.BLACK;
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	// Método abstrato, uma vez que cada subclasse vai determinar a forma como
	// esta
	// será desenhada pela caneta.
	public abstract void draw(Graphics g);
}
