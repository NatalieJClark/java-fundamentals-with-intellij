package bites.examples;
import java.util.ArrayList;


public class Queue {

    ArrayList<String> people;

    public Queue (ArrayList<String> people) {
        this.people = people;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(new ArrayList<String>());
        queue.add("Andy");
        queue.add("Matthew");
        queue.add("Neil");
        System.out.println(queue.next());
        queue.state();
    }

    public void add(String person) {
        this.people.add(person);
    }

    public String next() {
        return this.people.remove(0);
    }

    public void state() {
        System.out.println(people);
    }
}
