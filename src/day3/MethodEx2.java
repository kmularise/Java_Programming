package day3;

import java.util.Scanner;

public class MethodEx2 {

    static int mypower(int a, int b){

        int res =1;
        for (int i=0; i<b ; i++)
            res *=a;

        return res;
    }

    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter a, b :");
        int a = scin.nextInt();
        int b = scin.nextInt();
        int result =  mypower(a, b);
        System.out.println("result :" + result);
    }
}
