package day6;

class Person{
    private int id;
    private String name;
    Person(){}
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    void introduce(){
        System.out.println("I am "+name);
    }

}

class Student extends Person{
    private String school;
    Student(){}
    Student(int id, String name, String school){
        super(id, name);
        this.school = school;
    }

    void introduceSchool(){
        System.out.println("My school is "+school + " University");
    }

}

public class PersonTest{
    public static void main(String[] args) {
        Student s = (Student)new Person(10, "Alice");
        s.introduce();
        s.introduceSchool();//error가 뜸
    }
}