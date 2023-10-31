package bites.examples;

public class Discounter {
    // Class attributes:
    Double discount;

    // Constructor:
    public Discounter(Double discount){
        this.discount = discount;
    }

    public static void main(String[] args) {
        Discounter discounter = new Discounter(20.00);
        System.out.println("Discounting 20% from a 100 equals:");
        System.out.println(discounter.applyTo(100));
        // returns 80
        System.out.println("Discounting 20% from a 200 equals:");
        System.out.println(discounter.applyTo(200));
        // returns 180
    }

//    public Integer applyTo(Integer amount){
//        return amount - this.discount;
//    }

    public Double applyTo(Integer amount){
        return amount * (1 - (this.discount/100));
    }
}
