package cz.vse.riskujtlacitka.gamelogic;

public class Question {
	
	private String question;
	private int value;
	private boolean answered=false;
	
	public Question() {
		question = new String();
		
	}

	public Question(String question) {
		this.question = question;
	}

	public Question(String question, int value) {
		this.question = question;
		this.value = value;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isAnswered() {
		return answered;
	}

	public void setAnswered(boolean answered) {
		this.answered = answered;
	}

}
