package fi.iki.maf;

public class Score {

	int score;

	public Score() {
		score = 0;
	}

	public void adjust(int value) {
		score += value;
	}

	public int getScore() {
		return score;
	}

	public String getResultText() {
		return GameData.getResult(score);
	}
}
