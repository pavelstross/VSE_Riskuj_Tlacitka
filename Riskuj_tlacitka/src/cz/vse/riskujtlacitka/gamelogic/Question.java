package cz.vse.riskujtlacitka.gamelogic;

public class Question {
	
	private String questionText;
	private int value;
	private boolean answered=false;
	
	public Question() {
		questionText = new String();
		
	}

	public Question(String questionText) {
		this.questionText = questionText;
	}

	public Question(String question, int value) {
		this.questionText = question;
		this.value = value;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String question) {
		this.questionText = question;
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
