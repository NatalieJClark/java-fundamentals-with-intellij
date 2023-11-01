package bites.examples;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(1970));
        System.out.println(LeapYear.isLeapYear(1900));
        System.out.println(LeapYear.isLeapYear(1988));
        System.out.println(LeapYear.isLeapYear(1500));
    }

    public static Boolean isLeapYear(Integer year) {
        if (year % 400 == 0) {
            return true;
        } else {
            return year % 4 == 0 && year % 100 != 0;
        }
    }
}
