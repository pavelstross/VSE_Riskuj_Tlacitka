package cz.vse.riskujtlacitka.main;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import cz.vse.riskujtlacitka.gamelogic.Question;

public class Randomizer {
	DB db;
	Set<Integer> randomNumberListForTopics;
	Set<Integer> randomNumberListForQuestions;
	Random generator;

	public Randomizer(DB db) {
		this.db = db;
		generator = new Random();
		randomNumberListForTopics = new LinkedHashSet<>();
		randomNumberListForQuestions = new LinkedHashSet<>();
	}

	public void clearRandomizer() {
		randomNumberListForTopics.clear();
		randomNumberListForQuestions.clear();
	}

	public void randomizeListOfTopics() {
		for (int i = 0; i < MainApp.numberOfTopicsInGame; i++) {
			int randomNumberForTopic;
			do {
				randomNumberForTopic = generator.nextInt(db.getTopics().size());
			} while (randomNumberListForTopics.contains(randomNumberForTopic));
			randomNumberListForTopics.add(randomNumberForTopic);
		}
	}

	public ArrayList<Integer> getRandomizedListOfTopics() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (Integer i : randomNumberListForTopics) {
			arrayList.add(i);
		}
		return arrayList;
	}

	public void randomizeListOfQuestions(int topic) {
		randomNumberListForQuestions.clear();
		for (int j = 0; j < MainApp.numberOfQuestionsInGame; j++) {
			int randomNumberForQuestion;
			do {
				randomNumberForQuestion = generator.nextInt(db.getTopics()
						.get(topic).getQuestionList().size());
			} while (randomNumberListForQuestions
					.contains(randomNumberForQuestion));
			randomNumberListForQuestions.add(randomNumberForQuestion);

		}

	}

	public ArrayList<Question> getRandomizedListofQuestion(int topic) {
		ArrayList<Question> arrayList = new ArrayList<>();
		for (Integer i : randomNumberListForQuestions) {
			arrayList.add(db.getTopics().get(topic).getQuestionList().get(i));
		}
		return arrayList;
	}
}
