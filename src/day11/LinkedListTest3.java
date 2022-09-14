package day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest3 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("red"); list.add("blue"); list.add("purple"); list.add("yellow"); list.add("green");

        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            String s = iter.next();
            System.out.println(s);
        }
    }
}

class ArrayListIterator{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}