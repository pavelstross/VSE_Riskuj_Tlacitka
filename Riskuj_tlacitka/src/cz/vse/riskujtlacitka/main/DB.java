package cz.vse.riskujtlacitka.main;

import java.util.ArrayList;
import java.util.List;

import cz.vse.riskujtlacitka.gamelogic.Question;
import cz.vse.riskujtlacitka.gamelogic.Topic;

public class DB {
	
	private List<Topic> topics;
	
	public DB() {
		topics = new ArrayList<Topic>();
		fillDB();
	}
	
	private void fillDB() {
		
		Topic topic = new Topic("Topic A");
		topic.addQuestion(new Question("Otazka 1 topic A"));
		topic.addQuestion(new Question("Otazka 2 Topic A"));
		topics.add(topic);
		
		topic = new Topic("Topic B");
		topic.addQuestion(new Question("Otazka1 topic B"));
		topic.addQuestion(new Question("Otazka2 topic B"));
		topics.add(topic);		
	}
	
	
	
	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

}
