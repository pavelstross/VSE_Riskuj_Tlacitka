package cz.vse.riskujtlacitka.gamelogic;

public class Team {

	private int score;
	private String teamName;

	public Team() {

	}

	public Team(String teamName) {
		this.teamName = teamName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}
