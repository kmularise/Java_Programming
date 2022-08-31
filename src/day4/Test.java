package day4;

class Person{
    String name; // 자동 초기화되어 있다.
    int age;
    static String city = "Seoul";

    Person(){}//default 생성자
    Person(String n, int a){
        name = n;
        age = a;
    }

    void print(){
        System.out.println(name + ", "+age+", "+city );
    }
}

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Alice", 10);

        p1.print();
        p2.print();
        System.out.println(Person.city);
    }

}
