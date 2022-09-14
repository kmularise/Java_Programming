package day11;

import java.util.LinkedList;

public class LinkedListTest1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("red");
        list.add("blue");
        list.add("purple");
        list.add("yellow");
        list.add("green");

        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        list.remove(1);
        list.add(2,"white");
    }
}
