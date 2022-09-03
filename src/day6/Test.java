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

        Parent x = new Parent();
        Child y =  new Child();

        Parent a = new Child();//다형성
        a.show();//a.print();는 안됨
    }

}
