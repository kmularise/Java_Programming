package day6_abstract2;

abstract class Parent{
    private int data1;
    Parent(){}
    Parent(int a){data1 = a;}
    int getData(){return data1;}
    //abstract void show();
    void show(){
        System.out.println("data1 : "+data1);
    }
}

class Child extends Parent{
    private int data2;
    Child(){}
    Child(int a, int b){
        super(a);
        data2 =b;
    }

    void show(){
        System.out.println("data1:"+getData() + ", data2:"+data2);
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Child m = new Child(1,2);
        m.show();
        // Parent p = new Parent(10);
    }
}
