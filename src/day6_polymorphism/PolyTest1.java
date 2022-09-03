package day6_polymorphism;

class Parent{
    private int x;
    Parent(){}
    Parent(int x){this.x = x;}
    void show(){
        System.out.println("x :"+x);
    }
}

class Child extends Parent {
    private int y;
    Child(){}
    Child(int x, int y){
        super(x);
        this.y = y;
    }

    void show(){
        super.show();
        System.out.println("y: "+y);
    }
}

public class PolyTest1 {
    public static void main(String[] args) {
        Parent p = new Child(500,600);

        p.show();//자식 메소드에 접근
    }
}
