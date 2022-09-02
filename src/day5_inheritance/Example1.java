package day5_inheritance;

class Person{
    int no;
    String name;

    Person(){}
    Person(int no, String name){
        this.no = no;
        this.name = name;
    }
    void printAll(){
        System.out.println(no + " : "+name);
    }
}

class Student extends Person{
    int score;
    Student(){}
    Student(int no, String name, int score){
        this.no = no;
        this.name = name;
        this.score = score;
    }

    void printAll2(){
        printAll();
        System.out.println("score :" + score);
    }

}

public class Example1 {
    public static void main(String[] args) {
        Student s = new Student(1,"Alice",90);
        s.printAll();
        System.out.println();
        s.printAll2();
    }

}
