package cz.vse.riskujtlacitka.main;

import java.io.ObjectInputStream.GetField;

import cz.vse.riskujtlacitka.gamelogic.GameState;
import cz.vse.riskujtlacitka.gui.Gui;

public class MainApp {
	
	
	public final static String GameButtonColor = "blabla";
	
	
	public final static int numberOfTopicsInGame = 3;
	public final static int numberOfQuestionsInGame = 4;
	public final static int numberOfTeams = 8;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GameState gameState = GameState.getInstance();
		gameState.generateGameField();
		gameState.test();
		System.exit(0);
		//Gui gui = new Gui("auto", new GameState());
		
		
		
		
		
		
		//PlayersPanel gui;
		//gui = new PlayersPanel("auto");
		//gui.setActiveButton(3);

	}

}
