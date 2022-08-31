package day1_2;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        System.out.println("화씨온도 입력:");
        int ftemp = scin.nextInt();
        double ctemp = ((double)ftemp - 32.0)*(5.0)/(9.0);
        System.out.println("섭씨온도:"+ ctemp);
    }
}
