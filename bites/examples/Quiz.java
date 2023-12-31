package bites.examples;

// Learning to use instance fields
public class Quiz {
    // Class attributes
    String questionOne;
    String questionTwo;

    // Constructor method grabs values that are passed in, and assigns them to instance fields
    public Quiz(String questionOne, String questionTwo){
        this.questionOne = questionOne;
        this.questionTwo = questionTwo;
    }

    // Getter methods
    public String getQuestionOne(){
        return this.questionOne;
    }

    public String  getQuestionTwo(){
        return this.questionTwo;
    }

    // Main method
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz(
                "what is the capital of Burkina Faso?",
                "What is the capital of Bhutan?");
        System.out.println(myQuiz.getQuestionOne());
        System.out.println(myQuiz.getQuestionTwo());
    }
}
