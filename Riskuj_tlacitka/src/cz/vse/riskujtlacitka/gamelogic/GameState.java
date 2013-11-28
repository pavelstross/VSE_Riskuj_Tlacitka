package cz.vse.riskujtlacitka.gamelogic;

import java.awt.dnd.DnDConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cz.vse.riskujtlacitka.main.DB;
import cz.vse.riskujtlacitka.main.MainApp;
import cz.vse.riskujtlacitka.main.Randomizer;

public class GameState {

	private static GameState instance = null;
	private Question[][] questionField;
	private List<Team> teams;
	private DB db;
	private Randomizer randomizer;
	private ArrayList<Topic> topicsInGame;

	private GameState() {

		db = new DB();
		randomizer = new Randomizer(db);
		questionField = new Question[MainApp.numberOfTopicsInGame][MainApp.numberOfQuestionsInGame];
		topicsInGame = new ArrayList<>();
		teams = new ArrayList<>();

		for (int i = 0; i < MainApp.numberOfTeams; i++) {
			teams.add(new Team("Tým " + (i + 1)));
		}
	}

	public static GameState getInstance() {
		if (instance == null) {
			instance = new GameState();
		}
		return instance;
	}

	public void generateGameField() {
		randomizer.clearRandomizer();
		createTopicsInGame();
	}

	private void createTopicsInGame() {
		randomizer.randomizeListOfTopics();
		for (Integer i : randomizer.getRandomizedListOfTopics()) {
			randomizer.randomizeListOfQuestions(i);
			randomizer.getRandomizedListofQuestion(i);
			Topic topic = new Topic();
			topic.setTopicName(db.getTopics().get(i).getTopicName());
			topic.setQuestionList(randomizer.getRandomizedListofQuestion(i));
			topicsInGame.add(topic);

		}
	}
	
	public void test() {
		for (Topic topic : topicsInGame) {
			System.out.print(topic.getTopicName()+"\t\t");
			for (Question question : topic.getQuestionList()) {
				System.out.print(question.getQuestionText()+"\t\t");
			}
			System.out.print("\n");
		}

	}
}
