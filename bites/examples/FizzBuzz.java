package bites.examples;

// Learning conditional statements and for loops in Java
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 100; i > 0; i--) {
            System.out.println(FizzBuzz.play(i));
        }
    }
    public static String play(Integer number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(number);
        }
    }
}
