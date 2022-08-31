package day3;

import java.util.Scanner;

public class MethodTest1 {

    static int factorial(int m)
    {
        int result =1;
        for(;m>0;m--){
            result *=m;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = scin.nextInt();
        int result = factorial(n);
        System.out.println(n + "! ="+ result);
    }
}
