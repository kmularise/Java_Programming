package day6;

class Parent{

    void show(){
        System.out.println("parent show");
    }
}

class Child extends Parent{
    void print(){
        System.out.println("child print");
    }

}
public class Test {
    public static void main(String[] args) {

        Child x =  new Child();
        x.print();
        x.show();
    }

}
