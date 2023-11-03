package bites.examples;

public class Penguin implements BirdBehaviours {

    @Override
    public Boolean fly() {
        return false;
    }

    @Override
    public void sing(String song) {
        System.out.println(song + " " + song + " " + song);
    }

    @Override
    public void eat(String food) {
        System.out.println("Yum, I like eating " + food);
    }

    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        System.out.println(penguin.fly());
        penguin.sing("honk");
        penguin.eat("fish");
    }
}
