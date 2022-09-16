package day12;

import java.util.Comparator;
import java.util.TreeSet;

class Student2{
    private int id;
    private int score;
    Student2(){}
    Student2(int id, int score){this.id = id; this.score = score;}
    int getId(){return id;}
    public String toString(){return "[id="+id+", score="+score+"]";}
}

class StudentComparator implements Comparator<Student2>{
    public int compare(Student2 o1, Student2 o2){
        return o1.getId() - o2.getId();
    }
}

public class TreeSetTest2_2 {
    public static void main(String[] args) {
        TreeSet<Student2> ts = new TreeSet<>(new StudentComparator());

        ts.add(new Student2(20191234,83));
        ts.add(new Student2(20191511, 90));
        ts.add(new Student2(20190999,93));
        ts.add(new Student2(20191001,88));
        ts.add(new Student2(20190780,70));

        for(Student2 p:ts)
            System.out.println(p );
    }
}
