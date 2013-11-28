package cz.vse.riskujtlacitka.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import cz.vse.riskujtlacitka.gamelogic.GameState;

public class PlayersPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<JButton> playerButtonList;
	private GameState gameState;

	public PlayersPanel(GameState gameState, int width, int height) {
		this.gameState = gameState;
		this.setLayout(new GridLayout(1, 8));

		playerButtonList = new ArrayList<JButton>();
		for (int i = 0; i < 8; i++) {
			playerButtonList.add(new JButton());
		}

		for (int i = 0; i < playerButtonList.size(); i++) {
			playerButtonList.get(i).setPreferredSize(new Dimension(width, height));
			playerButtonList.get(i).setText("Tým " + (i + 1));
			
		}
		for (JButton button : playerButtonList) {
			deactivateTeamButtons();
			this.add(button);
		}

	}

	private void deactivateTeamButtons() {
		for (JButton button : playerButtonList) {
			button.setBackground(Color.gray);
		}
	}

	public void setActiveButton(int i) {
		playerButtonList.get(i).setBackground(Color.red);
	}
}
