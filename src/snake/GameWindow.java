package snake;

import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameWindow extends JFrame {
	private Rect background;
	private Snake snake;

	public GameWindow() {
		snake = new Snake();
		//
		setSize(Constants.WINDOW_HEIGHT, Constants.WINDOW_WIDTH);
		setResizable(false);
		setTitle(Constants.WINDOW_TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {

		background.draw(g);
		snake.draw(g);
	}
}

//todo o jogo vai se basear na junção de vários retângulos. 
//Logo essa nova classe "Drawable" vai conceber a ideia da figura ser desenhada na tela com o método "paint()"