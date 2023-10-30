package bites.examples;

public class Bagel {
    public static void main(String[] args) {
    Bagel myBagel = new Bagel();
        System.out.println("My bagel has " + myBagel.seeds());
        System.out.println("It has " + myBagel.filling() + " filling");
        System.out.println("It costs £" + myBagel.price());
    }

    public String seeds() {
        return "poppy seeds";
    }

    public String filling() {
        return "peanut butter";
    }

    public Integer price() {
        return 4;
    }
}
