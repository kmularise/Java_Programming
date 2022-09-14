package day11;

import java.util.*;

public class HashSetTest2 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();

        for(int i = 1 ; i<=10; i++){
            int num = (int)(Math.random()*45)+1;
            set.add(new Integer(num));//중복되는 값들은 저장되지 않는다.
        }

        List<Integer> list = new LinkedList<Integer>(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
