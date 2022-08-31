package day1_2;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        System.out.println("enter seconds : ");
        int input = scin.nextInt();
        int days = input/(24*60*60);
        input = input %(24*60*60);
        int hour = input / (60*60);
        input = input%(60*60);
        int minute = input / 60;
        int second = input % 60;

        System.out.println(days + "days" + hour + "hours" + minute + " minutes" + second + "seconds");

    }
}
