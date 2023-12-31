package bites.examples;

// Learning to use Interfaces in Java
public class Robin implements BirdBehaviours {

    @Override
    public Boolean fly() {
        return true;
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
        Robin robin = new Robin();
        System.out.println(robin.fly());
        robin.sing("chirp");
        robin.eat("worms");
    }
}
