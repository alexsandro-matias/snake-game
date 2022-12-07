package snake;

import java.awt.Dimension;
import java.awt.Point;

public class Snake extends Shape
{
	public Snake()
	{
		super(Constants.SNAKE_COLOR);
	}
	
	Point location = new Point(150, 150);
	Dimension dimension = new Dimension(5, 5);
	Rect rect = new Rect(location, dimension);
}
