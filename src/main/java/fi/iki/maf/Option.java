package fi.iki.maf;

import java.util.ArrayList;

public class Option {
	static public ArrayList<Option> getOptionList()
	{
		ArrayList<Option> options = GameData.getOptions();
		return options;
	}

	public Option(int firstRound, int lastRound, String beforeText, String afterText, String missedText, String completedText, int missedScoreChange, int completedScoreChange, Option prerequisite)
	{
		this.firstRound = firstRound;
		this.lastRound = lastRound;
		this.beforeText = beforeText;
		this.afterText = afterText;
		this.missedText = missedText;
		this.completedText = completedText;
		this.missedScoreChange = missedScoreChange;
		this.completedScoreChange = completedScoreChange;
		this.used = false;
		this.prerequisite = prerequisite;
	}

	public final int firstRound;
	public final int lastRound;
	public final String beforeText;
	public final String afterText;
	public final String missedText;
	public final String completedText;
	public final int missedScoreChange;
	public final int completedScoreChange;
	public final Option prerequisite;

	private boolean used;

	boolean isActive(int round)
	{
		if (prerequisite != null && !prerequisite.isUsed()) return false;
		if (isUsed()) return false;
		return round >= firstRound && round <= lastRound;
	}
	String getBeforeText() { return beforeText; }
	String getAfterText() { return afterText; }
	void use() { used = true; }
	boolean isUsed() { return used; }
	int getScoreChange() { return used ? completedScoreChange : missedScoreChange; }
	String getResultText() { return used ? completedText : missedText; }
}
