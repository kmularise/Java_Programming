package day11;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();

        st.push("red");
        st.push("yellow");
        st.push("green");
        st.push("blue");

        String s = st.pop();
        System.out.println("s :" + s);

        int index = st.search("red");
        System.out.println("index :" + index);

        System.out.println("<Stack pop>");

        while(!st.empty()){
            System.out.println(st.pop());
        }
    }
}
