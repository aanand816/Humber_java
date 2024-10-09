package Aanand_n01712678.Activity_4;

import java.util.Scanner;

public class Activity4_7 {
    public static int month_days = -1;

    public static int get_day(int year) {
        int day = 3; // January 1, 1801 was a Thursday
        for (int i = 1801; i < year; i++) {
            if (i % 4 == 0) {
                day += 2; // Leap year
            } else {
                day += 1;
            }
        }
        day = day % 7;
        if (day == 0) {
            day = 7;
        }
        return day;
    }

    public static void get_days(int month,int year){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            month_days = 31;
        } else if (month == 2) {
            if (year % 4 == 0) {
                month_days = 29;
            } else {
                month_days = 28;
            }
        } else {
            month_days = 30;
        }
    }
    // Calculating the month for the table
    public static int cal_month(int offset, int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            offset = (31 % 7 + offset) % 7;
            month_days = 31;
        } else if (month == 2) {
            if (year % 4 == 0) {
                offset = (29 % 7 + offset) % 7;
                month_days = 29;
            } else {
                offset = (28 % 7 + offset) % 7;
                month_days = 28;
            }
        } else {
            offset = (30 % 7 + offset) % 7;
            month_days = 30;
        }
        return offset;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.print("Enter the month number: ");
        int month = sc.nextInt();
        int offset = get_day(year);

        for (int i = 1; i < month; i++) {
            offset = cal_month(offset, i, year);
        }

        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for (int i = 0; i < offset; i++) {
            System.out.print("\t");
        }
        get_days(month,year);
        for (int day = 1; day <= month_days; day++) {
            System.out.print(day + "\t");
            if ((day + offset) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // Ensure the last line is printed correctly
    }
}
