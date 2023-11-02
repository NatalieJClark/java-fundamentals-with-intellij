package bites.examples;
import java.util.ArrayList;

public class Sandbox {
    public static void main(String[] args) {
        //  -------- Playing with ArrayLists---------
        ArrayList<String> contentsOfMyPocket = new ArrayList<String>();
        contentsOfMyPocket.add("keys");
        contentsOfMyPocket.add("phone");
        contentsOfMyPocket.add("fluff");
        System.out.println(contentsOfMyPocket);

        ArrayList<Integer> reallyGreatNumbers = new ArrayList<Integer>();
        reallyGreatNumbers.add(3);
        reallyGreatNumbers.add(5);
        reallyGreatNumbers.add(7);
        reallyGreatNumbers.add(11);

        // you can read / get an item using its list index
        System.out.println(reallyGreatNumbers.get(1));

        // you can change an item using its list index and the new value
        reallyGreatNumbers.set(0, 11);
        // would change the first item to 11
        System.out.println(reallyGreatNumbers.get(0));

        // you can remove an item using its list index
        reallyGreatNumbers.remove(0);
        // would remove the first item
        System.out.println(reallyGreatNumbers.get(0));

        //  -------- Playing with arrays---------

        // create an array of four Strings
        String[] famousCats = {"Larry", "Palmerston", "Geronimo", "Cat Stevens"};

        // get the first item and print it
        System.out.println(famousCats[0]);

        // change the first item and print it
        famousCats[0] = "Grumpy Cat";
        System.out.println(famousCats[0]);

        // remove the first item by replacing it will `null`
        famousCats[0] = null;
        System.out.println(famousCats[0]);

    }

}
