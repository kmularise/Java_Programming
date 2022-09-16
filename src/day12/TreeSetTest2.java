package day12;

import java.util.TreeSet;

class Student implements Comparable<Student> {
    private int id;
    private int score;
    Student(){}
    Student(int id, int score){this.id = id; this.score =score;}
    public String toString(){return "[id="+id+", score"+score+"]";}

    public int compareTo(Student s){
        return this.id -s.id;//오름차순-key가 기준이 되어야 함.
        //return s.id-this.id;//내림차순
    }

}

public class TreeSetTest2 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student(20191234,83));
        ts.add(new Student(20191511, 90));
        ts.add(new Student(20190999,93));
        ts.add(new Student(20191001,88));
        ts.add(new Student(20190780,70));
        System.out.println(ts);
    }
}
