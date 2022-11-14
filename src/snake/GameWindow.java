package snake;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial") public class GameWindow extends JFrame
{
	// Para criação de uma janela,
	// é necessário um construtor de uma janela.
	//
	// Retângulo que ser utilizado da classe implementada
	private Rect rect;
	
	public GameWindow()
	{
		//
		// Criando um objeto do tipo retângulo que será parâmetro já com o construtor.
		rect = new Rect(0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT, Color.BLACK);
		// Antes de Criar o construtor
		// // Pegando o ínicio da janela como referência
		// rect.setX(0);
		// rect.setY(0);
		// rect.setWidth(Constants.WINDOW_WIDTH);
		// rect.setHeight(Constants.WINDOW_HEIGHT);
		// rect.setColor(Color.BLACK);
		// Por herança é possível invocar métodos do pai.
		// ajustando um tamanho de janela.
		setSize(Constants.WINDOW_HEIGHT, Constants.WINDOW_WIDTH);
		// Para uma criar o fundo do jogo, é necessário criar
		// um fundo de mesmo tamanho da janela,
		// ou seja, retângulo == janela
		//
		// Negado o dimensionamento da janela.
		setResizable(false);
		// Título da janela.
		setTitle(Constants.WINDOW_TITLE);
		// Quando clicado no "X" da janela, a janela encerre.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// centralizando a janela
		setLocationRelativeTo(null);
		setVisible(true);
		//
		// Na classe JFrame existe um método chamado de paint()
		// porém, o que deseja é ter controle sobre esse desenho, o que não é
		// possível com
		// o método da superclasse. Então é necessário a sobrescrita deste
		// método.
	}
	
	@Override public void paint(Graphics g)
	{
		// g.setColor(Color.GREEN);
		// // Desenhando um Retângulo preenchido com a cor definida na linha de
		// // cima.
		// g.fillRect(100, 100, 250, 100);
		// posição deste retângulo, assim como, sua altura e largura.
		// g.fillRect(x,y,w,h);
		// a partir deste método, já possível dizer qual a posição relativa
		// deste
		// retâgulo preenchido.
		//
		// Porém, com a classe rect, que criamos, já é possível utilizar um
		// retângulo da classe implementada.
		// que será um novo atributo privado.
		rect.paint(g);
	}
}
