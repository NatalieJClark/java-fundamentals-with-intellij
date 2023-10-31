package bites.examples;

public class Order {
    // Class attributes:
    Integer total;

    // Constructor:
    public Order(Integer total){
        this.total = total;
    }

    // Main:
    public static void main(String[] args) {
        Order order = new Order(0);
        order.addAmount(20);
        order.addDiscount(5);
        Integer total = order.getTotal();
        System.out.println(total);
        String friendlyTotal = order.friendlyTotal();
        System.out.println(friendlyTotal);
    }

    // Instance methods:
    public void addAmount(Integer amount){
        this.total += amount;
    }

    public void addDiscount(Integer discount){
        this.total -= discount;
    }

    public String friendlyTotal(){
        return String.format("Thanks! The total value of your order is £%d.", this.total);
    }

    // Getter methods:
    public Integer getTotal(){
        return this.total;
    }

}
