package day9;

import java.util.*;

public class RandomTest {
    public static void main(String[] args) {
        Random rand1 = new Random(1);
        Random rand2 = new Random(1);

        for(int i =0; i<3; i++){
            System.out.println(rand1.nextInt()+"");

        }
        System.out.println();
        for(int i = 0; i < 3; i++)
            System.out.println(rand2.nextInt(100)+"");
    }
}
