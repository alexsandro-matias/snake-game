package snake;

import java.awt.Dimension;
import java.awt.Point;

public class Snake extends Shape
{
	private Direction direction;
	
	public Snake()
	{
		super(Constants.SNAKE_COLOR);
	}
	// O retângulo mais importante da cobra é cabeça, pois é ela que direciona
	// todo o restante de
	// conjunto de retângulos
	//
	
	Point location = new Point(150, 150);
	Dimension dimension = new Dimension(15, 15);
	Rect rect = new Rect(location, dimension);
	
	
}
