package cz.vse.riskujtlacitka.main;

import java.util.List;

import cz.vse.riskujtlacitka.gamelogic.Topic;

public class DB {
	
	private List<Topic> topics;
	
	public DB() {
		
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

}
