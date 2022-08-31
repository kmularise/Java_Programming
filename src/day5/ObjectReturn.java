package day5;
/*
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
        this.age =age;
    }

    void printPerson(){
        System.out.println(
                name + " is " + age + "years old"
        );
    }
}*/

public class ObjectReturn {
    public static Person makeNewPerson(String name, int age){
        Person temp = new Person(name, age);
        return temp;
    }

    public static void main(String[] args) {
        String myName = "David";
        int myAge = 15;
        Person p = makeNewPerson(myName, myAge);
        p.printPerson();
    }
}
