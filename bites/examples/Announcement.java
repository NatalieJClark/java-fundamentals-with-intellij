package bites.examples;

public class Announcement {
    public static void main(String[] args){
        Announcement myAnnouncement = new Announcement();
        System.out.println(myAnnouncement.celebration());
        System.out.println(myAnnouncement.changeOfPlan());
        System.out.println(myAnnouncement.apology());
        System.out.println(myAnnouncement.politeNotice());
        System.out.println(myAnnouncement.helpNeeded());
    }

    public String celebration(){
        return "Happy birthday!";
    }

    public String changeOfPlan(){
        return "There's been a change of plan!";
    }
    public String apology(){
        return "Sorry!";
    }

    public String politeNotice(){
        return "Please keep off the grass!";
    }

    public String helpNeeded(){
        return "Help!";
    }
}
