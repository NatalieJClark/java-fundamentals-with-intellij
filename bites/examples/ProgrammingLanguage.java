package bites.examples;

public class ProgrammingLanguage {
    // Class attributes:
    String name;
    Integer yearOfCreation;
    String creator;

    // Constructor:
    public ProgrammingLanguage(String name, Integer yearOfCreation, String creator){
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.creator = creator;
    }

    public static void main(String[] args) {
        ProgrammingLanguage python = new ProgrammingLanguage("Python", 1991, "Guido van Rossum");
        ProgrammingLanguage java = new ProgrammingLanguage("Java", 1995, "James Gosling");
        ProgrammingLanguage javaScript = new ProgrammingLanguage("JavaScript", 1995, "Brendan Eich");
        System.out.println(python.name + " - " + python.yearOfCreation + " - " + python.creator);
        System.out.println(java.name + " - " + java.yearOfCreation + " - " + java.creator);
        System.out.println(javaScript.name + " - " + javaScript.yearOfCreation + " - " + javaScript.creator);
    }
}
