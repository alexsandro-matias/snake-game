package snake;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

public class Rect extends Drawable
{
	private Point location;
	private Dimension dimension;
	
	public Rect(Point point, Dimension dimension)
	{
		this.location = point;
		this.dimension = dimension;
	}
	
	public Rect(int x, int y, int width, int height)
	{
		this.location = new Point(x, y);
		this.dimension = new Dimension(width, height);
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
