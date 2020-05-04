package fi.iki.maf;

import java.util.ArrayList;

public class Round {

	int index;
	ArrayList<Option> options;

	public Round(int i, ArrayList<Option> allOptions)
	{
		index = i;
		options = new ArrayList<>();

		allOptions.forEach(o -> {
			if (o.isActive(i)) options.add(o);
		});
	}

	public static int getFirstRound() {
		return GameData.FirstRound;
	}

	public static int getLastRound() {
		return GameData.LastRound;
	}

	public ArrayList<Option> getOptions() {
		return options;
	}

	public String getIntroduction() {
		return GameData.getIntroduction(index);
	}
}
