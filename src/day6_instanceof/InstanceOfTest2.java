package day6_instanceof;

class Person{
    private int idNo;
    private String name;
    Person(){}
    Person(int idNo, String name){
        this.idNo = idNo; this.name =name;
    }
    void print(){
        System.out.println("idNo :" + idNo +". name:"+name);
    }
}
class Student extends Person{
    private int year;
    Student(){}
    Student(int idNo, String name, int year){
        super(idNo,name); this.year = year;
    }
    void print(){super.print(); System.out.println(".year :" + year); }
}
class Teacher extends Person{
    private String subject;
    Teacher(){}
    Teacher(int idNo, String name, String subject){
        super(idNo, name); this.subject = subject;
    }
    void print(){super.print(); System.out.println(".subject: "+subject);}
}


public class InstanceOfTest2 {
    public static void main(String[] args) {
        Person p[] = new Person[5];
        p[0] = new Student(12, "Hong Gil Dong",1);
        p[1] = new Student(24, "Kim Young Hee",2);
        p[2] = new Teacher(201220,"Lee Chul Soo","Math");
        p[3] = new Teacher(201310, "Park Mi Young","English");
        p[4] = new Student(15,"Jung Young Ah",2);

        for(int i=0; i<p.length;i++) p[i].print();

    }
}
