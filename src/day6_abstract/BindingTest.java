package day6_abstract;

abstract class Parent{
    abstract void show();
}
/*class Parent{

    //void show(){}
}*/

class Child1 extends Parent{
    void show(){
        System.out.println("I am Child1");
    }
}

class Child2 extends Parent{
    void show(){
        System.out.println("I am Child2");
    }
}

class Child3 extends Parent{
    void show(){
        System.out.println("I am Child3");
    }
}

public class BindingTest {
    public static void main(String[] args) {
        Parent p1 = new Child1();
        Parent p2  = new Child2();
        Parent p3 = new Child3();
        p1.show();
        p2.show();
        p3.show();//다형성
    }
}
