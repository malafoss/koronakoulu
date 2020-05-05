package fi.iki.maf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Koronakoulu
 * (c) Mikko Ala-Fossi 2020
 */
public class Main
{

    static int readOption(BufferedReader in, int maxOption)
    {
        while (true) {
            System.out.print("[1-" + maxOption + "q] ? ");
            try {
                String s = in.readLine();
                if (s.equalsIgnoreCase("q")) {
                    // Quit
                    return 0;
                }
                int number = Integer.parseInt(s);
                if (number >= 1 && number <= maxOption) {
                    // Option selected
                    return number;
                }
            }
            catch (Exception e) {
            }
        }
    }

    public static void main( String[] args )
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Option> options = Option.getOptionList();

        Score score = new Score();

        for (int i = Round.getFirstRound(); i <= Round.getLastRound(); i++) {

            Round round = new Round(i, options);

            System.out.println("\n" + round.getIntroduction() + "\n");

            int count = 0;
            for (Option o : round.getOptions()) {
                count++;
                System.out.println("[" + count + "] " + o.getBeforeText());
            }

            int chosen = readOption(in, count);
            if (chosen == 0) break;

            Option option = round.getOptions().get(chosen-1);
            option.use();
            score.adjust(option.getScoreChange());
            System.out.println("\n" + option.getAfterText());
        }

        System.out.println();
        options.forEach(o -> {
            String s = o.getResultText();
            if (s != null) System.out.println(s);
        });

        System.out.println("\n" + score.getScore() + " - " + score.getResultText() + "\n");
    }
}
