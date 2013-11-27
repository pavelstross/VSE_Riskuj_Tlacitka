package cz.vse.riskujtlacitka.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import cz.vse.riskujtlacitka.gamelogic.GameState;
import cz.vse.riskujtlacitka.main.MainApp;

public class GamePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<JButton> gameButtonList;
	private GameState gameState;

	public GamePanel(GameState gameState, int width, int height) {
		this.gameState = gameState;
		this.setLayout(new GridLayout(MainApp.numberOfTopicsInGame, MainApp.numberOfQuestionsInGame));
		gameButtonList = new ArrayList<JButton>();
		for (int i = 0; i < (MainApp.numberOfQuestionsInGame * MainApp.numberOfTopicsInGame); i++) {
			gameButtonList.add(new JButton("Test"));
		}
		for (JButton button : gameButtonList) {
			button.setBackground(Color.BLUE);
			button.setPreferredSize(new Dimension((width / MainApp.numberOfQuestionsInGame), height / MainApp.numberOfTopicsInGame));
			this.add(button);
		}

	}

	public void update() {
		System.out.println("UPDATED");
	}
}
