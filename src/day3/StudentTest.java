package day3;

class Student{
    int no;
    String name;
    int score;

    void changeScore(int s){
        score = s;
    }

    void printData(){
        System.out.println(no+" "+name+" "+" "+ score);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1;
        s1 =  new Student();
        s1.no = 20201234;
        s1.name = "Lee";
        s1.score = 90;

        Student s2 =  new Student();
        s2.no = 20201000;
        s2.name = "Kim";
        s2.score = 93;

        s1.printData();
        s2.printData();
        s1.changeScore(95);
        s2.changeScore(90);
        s1.printData();
        s2.printData();
    }
}
