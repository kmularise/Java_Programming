package day11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest1 {
    public static void main(String[] args) {
        String[] a = {"1","2","2","3","3","2","4","1","4","4"};
        Set<String> set = new HashSet<String>();
        //Set<String> set = new LinkedHashSet<String>();

        for(int i = 0; i<a.length;i++)
            set.add(a[i]);//HashSet set에 배열 a의 원소들을 저장한다.
        System.out.println(set);//HashSet에 저장된 요소들을 출력한다.

    }
}
