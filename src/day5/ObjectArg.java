package day5;

class Person{
    private String name;
    private int age;

    Person(){}
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    int getAge(){return age;}
    void setAge(int age){
        this.age = age;
    }

    void printPerson(){
        System.out.println(name+" is " + age + " years old");

    }
}

public class ObjectArg {

    public static void changeInfo(Person p, int newAge){
        p.setAge(newAge);
    }

    public static void main(String[] args) {
        Person alice = new Person("Alice",9);
        Person bob = new Person("Bob",12);

        changeInfo(alice, 10);
        changeInfo(bob, 11);

        alice.printPerson();
        bob.printPerson();

    }
}
