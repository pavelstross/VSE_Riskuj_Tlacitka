package cz.vse.riskujtlacitka.gui;

import java.awt.BorderLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

import cz.vse.riskujtlacitka.gamelogic.GameState;

public class Gui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int screenDivisor = 4;
	private PlayersPanel playersPanel;
	private GameState gameState;
	private GamePanel gamePanel;
	private int screenWidth = 0;
	private int screenHeight = 0;

	public Gui(GameState gameState) {
		this.gameState = gameState;
		drawComponentsWithoutResolution();
	}

	public Gui(int width, int height, GameState gameLogic) {
		this.gameState = gameLogic;
		screenWidth = width;
		screenHeight = height;
		drawComponentsToResolution(screenWidth, screenHeight);
	}

	public Gui(String s, GameState gameLogic) {
		this.gameState = gameLogic;
		if (s.equals("auto")) {
			GraphicsDevice gd = GraphicsEnvironment
					.getLocalGraphicsEnvironment().getDefaultScreenDevice();
			screenWidth = gd.getDisplayMode().getWidth();
			screenHeight = (gd.getDisplayMode().getHeight());
			drawComponentsToResolution(screenWidth, screenHeight);
		} else {
			drawComponentsWithoutResolution();
		}
	}

	private void initializeComponents() {
		gamePanel = new GamePanel(gameState, screenWidth, screenHeight * (screenDivisor-1)/screenDivisor);
		playersPanel = new PlayersPanel(gameState,screenWidth, screenHeight / screenDivisor);
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(gamePanel, BorderLayout.NORTH);
		this.getContentPane().add(playersPanel, BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void drawComponentsWithoutResolution() {
		initializeComponents();
		this.setVisible(true);

	}

	private void drawComponentsToResolution(int width, int height) {
		initializeComponents();
		this.setSize(width, height);
		this.setLocation(0, 0);
		this.setVisible(true);

	}
}
