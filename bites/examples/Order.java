package bites.examples;

public class Order {
    // Class attributes:
    Integer total = 0;

    // Main:
    public static void main(String[] args) {
        Order order = new Order();
        order.addAmount(20);
        order.addDiscount(5);
        Integer total = order.getTotal();
        System.out.println(total);
    }

    // Instance methods:
    public void addAmount(Integer amount){
        this.total += amount;
    }

    public void addDiscount(Integer discount){
        this.total -= discount;
    }

    // Getter methods:
    public Integer getTotal(){
        return this.total;
    }

}
