package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

//import controller.keyHandler;
//import controller.mouseController;

public class GamePanel extends JPanel implements Runnable {
	
	//----------------Screen Setting------------------
		private Game game;
		final int originalTileSize = 16; // 16x16
		final int scale = 3;
	
		public final int tileSize = originalTileSize * scale; // 48x48
		final int maxScreenCol = 16;
		final int maxScreenRow = 12;
	
		final int screenWidth = tileSize * maxScreenCol; // 1008px
		final int screenHeight = tileSize * maxScreenRow; // 720px
	
		public GamePanel(Game game) {
			this.setPreferredSize(new Dimension(screenWidth, screenHeight));
			this.setBackground(Color.red);
			this.setDoubleBuffered(true);
			
			if (game != null) {
			    this.game = game;
			} else {
			    this.game = new Game();
			}

		}
		
	//--------------------------------------------------
	
		
	public void update() {
		//Put Update function here
		
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		game.render(g);
	}


	@Override
	public void run() {
		
		
	}

}