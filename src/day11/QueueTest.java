package day11;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<String>();

        q.offer("red");
        q.offer("yellow");
        q.offer("green");

        String s = q.element();
        System.out.println(s);

        System.out.println("<Queue poll>");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }

}
