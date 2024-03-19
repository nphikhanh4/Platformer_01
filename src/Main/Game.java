package Main;

import java.awt.Graphics;
import java.awt.Graphics2D;

import GameStates.GameState;
import GameStates.Menu;
import GameStates.Playing;

public class Game implements Runnable {

	private GamePanel gamePanel;
	private Thread gameThread;
	
	private Playing playing;
	private Menu menu;
	
	
	public Game() {
		initClasses();
		startGameLoop();
	}
	
	private void startGameLoop() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	private void initClasses() {
		gamePanel = new GamePanel(this);
		menu = new Menu(this);
		playing = new Playing(this);
	}

	public void update() {
		switch (GameState.state) {
			case MENU:
				menu.update();
				break;
			case PLAYING:
				playing.update();
				break;

		}
	}
	
	public void render(Graphics g) {
		switch (GameState.state) {
		case MENU:
			menu.draw(g);
			System.out.println("load");
			break;
		case PLAYING:
			playing.draw(g);
			break;
		default:
			break;
		}
	}

	@Override
	public void run() {
		update();
//		render(g);
			
	}
	
}