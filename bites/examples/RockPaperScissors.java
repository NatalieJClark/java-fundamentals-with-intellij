package bites.examples;

import java.util.HashMap;

// Learning to use HashMaps in Java
public class RockPaperScissors {

    static HashMap<String, HashMap<String, String>> rules = new HashMap<String, HashMap<String, String>>();

    public static void main(String[] args) {
        HashMap<String, String> rockOutcomes = new HashMap<String, String>();
        rockOutcomes.put("rock", "It's a draw!");
        rockOutcomes.put("paper", "Player two wins!");
        rockOutcomes.put("scissors", "Player one wins!");

        HashMap<String, String> paperOutcomes = new HashMap<String, String>();
        paperOutcomes.put("rock", "Player one wins!");
        paperOutcomes.put("paper", "It's a draw!");
        paperOutcomes.put("scissors", "Player two wins!");

        HashMap<String, String> scissorsOutcomes = new HashMap<String, String>();
        scissorsOutcomes.put("rock", "Player two wins!");
        scissorsOutcomes.put("paper", "Player one wins!");
        scissorsOutcomes.put("scissors", "It's a draw!");

        rules.put("rock", rockOutcomes);
        rules.put("paper", paperOutcomes);
        rules.put("scissors", scissorsOutcomes);

        String outcome = rules.get("rock").get("paper");
        System.out.println(outcome);
    }
}
