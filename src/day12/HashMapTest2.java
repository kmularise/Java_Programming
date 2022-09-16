package day12;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("alice", "1234");
        map.put("david", "1357");
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("---Enter id and password ---");
            System.out.println("id :");
            String id = s.nextLine().trim();
            System.out.println("password :");
            String password = s.nextLine().trim();
            System.out.println();
            if (!map.containsKey(id)) {
                System.out.println("Wrong id");
                continue;
            } else {
                if (!(map.get(id)).equals(password)) System.out.println("Wrong password");
                else {System.out.println("OK!"); break;}
            }
        }
        s.close();
    }
}
