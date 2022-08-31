package day_inheritance;

class Parent{
    int x =10;
}

class Child extends Parent{
    int x=20;
    void test(){
        System.out.println("x: "+x);
        System.out.println("this.x: "+this.x);
        System.out.println("super.x: "+super.x);
    }
}//x 내껄 우선으로, 없으면 부모꺼에서 찾는다.

public class Example3 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        c.test();

        System.out.println("p.x: "+p.x);
        System.out.println("c.x: "+c.x);
    }
}
