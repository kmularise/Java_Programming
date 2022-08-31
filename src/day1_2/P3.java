package day1_2;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter input data");
        int n = scin.nextInt();
        int sum = 0;

        for(int i=1 ; i<n+1; i++){
            sum+=i;
        }

        System.out.println("1부터 "+n+"의 합은 "+sum+"입니다.");
    }
}
