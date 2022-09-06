package day7;

interface Parent{
    int data = 100;
    default void show(){
        System.out.println("I am show default method");
    }
}
class Child implements Parent{
    private int data2;
    Child(){}
    Child(int data2){
        this.data2 = data2;
    }
    public void print(){
        System.out.println("data :"+data+", data2:"+data2);
    }
}

public class DefaultMethodTest {
    public static void main(String[] args) {
        Child c = new Child(200);
        c.print();
        c.show();
    }
}
