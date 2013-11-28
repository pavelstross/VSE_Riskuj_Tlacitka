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
		topic.addQuestion(new Question("Otazka 2 topic A"));
		topic.addQuestion(new Question("Otazka 3 topic A"));
		topic.addQuestion(new Question("Otazka 4 topic A"));
		topic.addQuestion(new Question("Otazka 5 topic A"));
		topic.addQuestion(new Question("Otazka 6 topic A"));
		topic.addQuestion(new Question("Otazka 7 topic A"));
		topic.addQuestion(new Question("Otazka 8 topic A"));
		topic.addQuestion(new Question("Otazka 9 topic A"));
		topics.add(topic);
		
		topic = new Topic("Topic B");
		topic.addQuestion(new Question("Otazka 1 topic B"));
		topic.addQuestion(new Question("Otazka 2 topic B"));
		topic.addQuestion(new Question("Otazka 3 topic B"));
		topic.addQuestion(new Question("Otazka 4 topic B"));
		topic.addQuestion(new Question("Otazka 5 topic B"));
		topic.addQuestion(new Question("Otazka 6 topic B"));
		topic.addQuestion(new Question("Otazka 7 topic B"));
		topic.addQuestion(new Question("Otazka 8 topic B"));
		topic.addQuestion(new Question("Otazka 9 topic B"));
		topics.add(topic);
		
		topic = new Topic("Topic C");
		topic.addQuestion(new Question("Otazka 1 topic C"));
		topic.addQuestion(new Question("Otazka 2 topic C"));
		topic.addQuestion(new Question("Otazka 3 topic C"));
		topic.addQuestion(new Question("Otazka 4 topic C"));
		topic.addQuestion(new Question("Otazka 5 topic C"));
		topic.addQuestion(new Question("Otazka 6 topic C"));
		topic.addQuestion(new Question("Otazka 7 topic C"));
		topic.addQuestion(new Question("Otazka 8 topic C"));
		topic.addQuestion(new Question("Otazka 9 topic C"));
		topics.add(topic);
		
		topic = new Topic("Topic D");
		topic.addQuestion(new Question("Otazka 1 topic D"));
		topic.addQuestion(new Question("Otazka 2 topic D"));
		topic.addQuestion(new Question("Otazka 3 topic D"));
		topic.addQuestion(new Question("Otazka 4 topic D"));
		topic.addQuestion(new Question("Otazka 5 topic D"));
		topic.addQuestion(new Question("Otazka 6 topic D"));
		topic.addQuestion(new Question("Otazka 7 topic D"));
		topic.addQuestion(new Question("Otazka 8 topic D"));
		topic.addQuestion(new Question("Otazka 9 topic D"));
		topics.add(topic);
		
		topic = new Topic("Topic E");
		topic.addQuestion(new Question("Otazka 1 topic E"));
		topic.addQuestion(new Question("Otazka 2 topic E"));
		topic.addQuestion(new Question("Otazka 3 topic E"));
		topic.addQuestion(new Question("Otazka 4 topic E"));
		topic.addQuestion(new Question("Otazka 5 topic E"));
		topic.addQuestion(new Question("Otazka 6 topic E"));
		topic.addQuestion(new Question("Otazka 7 topic E"));
		topic.addQuestion(new Question("Otazka 8 topic E"));
		topic.addQuestion(new Question("Otazka 9 topic E"));
		topics.add(topic);
		
		topic = new Topic("Topic F");
		topic.addQuestion(new Question("Otazka 1 topic F"));
		topic.addQuestion(new Question("Otazka 2 topic F"));
		topic.addQuestion(new Question("Otazka 3 topic F"));
		topic.addQuestion(new Question("Otazka 4 topic F"));
		topic.addQuestion(new Question("Otazka 5 topic F"));
		topic.addQuestion(new Question("Otazka 6 topic F"));
		topic.addQuestion(new Question("Otazka 7 topic F"));
		topic.addQuestion(new Question("Otazka 8 topic F"));
		topic.addQuestion(new Question("Otazka 9 topic F"));
		topics.add(topic);
		
		topic = new Topic("Topic G");
		topic.addQuestion(new Question("Otazka 1 topic G"));
		topic.addQuestion(new Question("Otazka 2 topic G"));
		topic.addQuestion(new Question("Otazka 3 topic G"));
		topic.addQuestion(new Question("Otazka 4 topic G"));
		topic.addQuestion(new Question("Otazka 5 topic G"));
		topic.addQuestion(new Question("Otazka 6 topic G"));
		topic.addQuestion(new Question("Otazka 7 topic G"));
		topic.addQuestion(new Question("Otazka 8 topic G"));
		topic.addQuestion(new Question("Otazka 9 topic G"));
		topics.add(topic);
	}
	
	
	
	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

}
