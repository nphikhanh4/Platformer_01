package Main;

import java.awt.Color;

import javax.swing.JFrame;

import GameStates.Menu;
import GameStates.Playing;

public class Main {

public static void main(String[] args) {
	
	//-----------Window-------------
			Game game = null;
			JFrame window = new JFrame();
			GamePanel gamePanel = new GamePanel(game);
			window.setTitle("Dragon_invaders of YisiniT_HoanDuy");
			window.setResizable(false);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
			window.add(gamePanel);
			window.pack();
			window.setLocationRelativeTo(null);
			window.setVisible(true);
	
	//------------------------------		
			new Game();
		}
	}
