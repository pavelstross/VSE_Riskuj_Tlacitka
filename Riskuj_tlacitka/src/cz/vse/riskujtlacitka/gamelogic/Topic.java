package cz.vse.riskujtlacitka.gamelogic;

import java.util.ArrayList;

public class Topic {
	
	private String topicName;
	private java.util.List<Question> questionList;

	public Topic() {
		questionList = new ArrayList<>();
	}

	public Topic(String topicName) {
		this.topicName = topicName;
		questionList = new ArrayList<>();
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public java.util.List<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(java.util.List<Question> questionList) {
		this.questionList = questionList;
	}

	public void addQuestion(Question question) {
		questionList.add(question);
	}

	public Question getQuestionByValue(int value) {
		for (Question question : questionList) {
			if (value == question.getValue()) {
				return question;
			}
		}
		return null;
	}
	
	public Question getQuestionByOrder(int i) {
		return questionList.get(i);
	}
}
