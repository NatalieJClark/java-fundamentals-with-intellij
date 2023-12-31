package bites.examples;
import java.util.Arrays;
import java.util.HashMap;

// Learning to use HashMaps in Java
public class ScratchPad {
    public static void main(String[] args) {
        HashMap<String, Integer[]> scores = new HashMap<String, Integer[]>();

        scores.put("Puffins", new Integer[] {1, 2, 2});
        scores.put("Tigers", new Integer[] {1, 2, 2});
        scores.put("Buffalos", new Integer[] {2, 0, 2});

        System.out.println(scores.get("Puffins")[0]);
        System.out.println(Arrays.toString(scores.get("Tigers")));
        System.out.println(Arrays.toString(scores.get("Buffalos")));
    }


}
