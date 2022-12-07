package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Shape extends Drawable
{
	// Como o Shape é um conjunto de Retângulos, usaremos o conceito de
	// Coleções.
	private List<Rect> rects;
	
	public Shape(Color color)
	{
		setColor(color);
		rects = new ArrayList<>();
	}
	
	public List<Rect> getRects()
	{
		return rects;
	}
	
	public void addRect(Rect rect)
	{
		rects.add(rect);
	}
	
	@Override public void draw(Graphics g)
	{
		g.setColor(getColor());
		
		for (Rect r : rects)
		{
			r.draw(g);
		}
	}
}
