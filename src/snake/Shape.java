package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class Shape extends Drawable {

	// Como o Shape é um conjunto de Retângulos, usaremos o conceito de Coleções.
	private List<Rect> rects;

	public Shape(Color color) {

		setColor(color);

	}

	@Override
	public void draw(Graphics g) {
		for (Rect r : rects) {
			r.draw(g);
		}

	}

}
