package cz.vse.riskujtlacitka.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import cz.vse.riskujtlacitka.gamelogic.GameState;

public class GamePanel extends JPanel {

	private List<JButton> playerButtonList;
	private GameState gameState;

	public GamePanel(GameState gameState, int width, int height) {
		this.gameState = gameState;
		this.setLayout(new GridLayout(gameState
				.getTopics(), gameState.getQuestions()));
		playerButtonList = new ArrayList<JButton>();
		for (int i = 0; i < (gameState.getQuestions()*gameState.getTopics()); i++) {
			playerButtonList.add(new JButton("Test"));
		}
		for (JButton button : playerButtonList) {
			button.setBackground(Color.BLUE);
			button.setPreferredSize(new Dimension((width/gameState.getQuestions()),height/gameState.getTopics()));
			this.add(button);
		}

	}

	public void update() {
		System.out.println(gameState.getQuestions());
	}
}
