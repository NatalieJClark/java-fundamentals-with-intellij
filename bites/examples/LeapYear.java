package bites.examples;
import java.util.ArrayList;

// Learning conditional statements, for loops and while loops in Java
public class LeapYear {
    public static void main(String[] args) {
        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(1970));
        System.out.println(LeapYear.isLeapYear(1900));
        System.out.println(LeapYear.isLeapYear(1988));
        System.out.println(LeapYear.isLeapYear(1500));
        System.out.println(LeapYear.listLeapYears(2000, 2008));
        System.out.println(LeapYear.closestLeapYear(2013));
    }

    public static Boolean isLeapYear(Integer year) {
        if (year % 400 == 0) {
            return true;
        } else {
            return year % 4 == 0 && year % 100 != 0;
        }
    }

    public static ArrayList<Integer> listLeapYears(Integer startYear, Integer endYear) {
        ArrayList<Integer> leapYears = new ArrayList<>();
        for (Integer i = startYear; i <= endYear; i++) {
            if (LeapYear.isLeapYear(i)) {
                leapYears.add(i);
            }
        }
        return leapYears;
    }

    public static Integer closestLeapYear(Integer checkYear) {
        int offset = 0;
        while (true) {
            if (LeapYear.isLeapYear(checkYear + offset)) {
                return checkYear + offset;
            } else if (LeapYear.isLeapYear(checkYear - offset)) {
                return checkYear - offset;
            }
            offset++;
        }
    }
}

