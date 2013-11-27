package cz.vse.riskujtlacitka.gamelogic;

import java.util.ArrayList;

public class Topic {
	
	private java.util.List<Question> questionList;
	
	public Topic() {
		questionList = new ArrayList<>();
	}

	public java.util.List<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(java.util.List<Question> questionList) {
		this.questionList = questionList;
	}

}
