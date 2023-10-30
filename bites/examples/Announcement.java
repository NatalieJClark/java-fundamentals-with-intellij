package bites.examples;

public class Announcement {
    public static void main(String[] args){
        System.out.println(Announcement.celebration());
        System.out.println(Announcement.changeOfPlan());
        System.out.println(Announcement.apology());
        System.out.println(Announcement.politeNotice());
        System.out.println(Announcement.helpNeeded());
    }

    public static String celebration(){
        return "Happy birthday!";
    }

    public static String changeOfPlan(){
        return "There's been a change of plan!";
    }
    public static String apology(){
        return "Sorry!";
    }

    public static String politeNotice(){
        return "Please keep off the grass!";
    }

    public static String helpNeeded(){
        return "Help!";
    }
}
