package snake;

import java.awt.Color;
import java.awt.Graphics;

public class Rect
{
	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;
	
	public Rect(int x, int y, int width, int height, Color color)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	// Criando um método importando de do pacote awt que
	// faz com que o retângulo saiba se desenhar na tela.
	// Este método será utilizado no momento que objeto do tipo triângulo for
	// utilizado
	public void paint(Graphics g)
	{
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}
}
