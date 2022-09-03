package day6_abstract;

abstract class Data{
    private int x;
    Data(){}
    Data(int x) {this.x =x;}
    abstract void print();
}

abstract class Child extends Data{
    void print(){
        System.out.println("Child print");
    }
}
public class Test {
    public static void main(String[] args) {
       // Parent c = new Child();
    }
}
