package day3;

import java.util.Arrays;

public class MethodTest2 {

    public static void updateArray(int[] B){
        for(int i=0;i<B.length;i++)
            B[i]*=2;
    }

    public static void main(String[] args) {
        int A[] = {5,2,1,4};

        updateArray(A);

        System.out.println(Arrays.toString(A));
    }
}
