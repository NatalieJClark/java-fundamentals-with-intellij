package bites.examples;

import java.util.Arrays;
import java.util.HashMap;

public class ScrabbleScore {
    static HashMap<String, Integer> letterValues = new HashMap<String, Integer>();

    public static void main(String[] args) {
        String[] onePoint = {"A", "E", "I", "O", "U", "L", "N", "S", "T", "R"};
        for (int i = 0; i < onePoint.length; i++) {
            letterValues.put(onePoint[i], 1);
        }
        String[] threePoints = {"B", "C", "M", "P"};
        for (int i = 0; i < threePoints.length; i++) {
            letterValues.put(threePoints[i], 3);
        }
        String[] fourPoints = {"F", "H", "V", "W", "Y"};
        for (int i = 0; i < fourPoints.length; i++) {
            letterValues.put(fourPoints[i], 4);
        }
        letterValues.put("D", 2);
        letterValues.put("G", 2);
        letterValues.put("K", 5);
        letterValues.put("J", 8);
        letterValues.put("X", 8);
        letterValues.put("Q", 10);
        letterValues.put("Z", 10);

        System.out.println(calculate("EXQUISITELY"));
    }

    private static Integer calculate(String word) {
        String[] splitWord = word.split("(?!^)");
        Integer score = 0;
        for (int i = 0; i < splitWord.length; i++) {
            score += letterValues.get(splitWord[i]);
        }
        return score;
    }
}
