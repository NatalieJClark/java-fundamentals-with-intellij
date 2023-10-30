package bites.examples;

class Message {
    public static void main(String[] args) {
        System.out.println("Hello? Is there anyone out there?");
        System.out.println(args);
        Message.hello();
    }
    public static void hello() {
        System.out.println("Hello!");
    }
}
