package day5_inheritance;

class A{
    A(){
        System.out.println("I am A");
    }
}

class B extends A {
    B(){
        System.out.println("I am B");
    }
}

class C extends B {
    C(){
        System.out.println("I am C");
    }
}

public class Order {
    public static void main(String[] args) {
        C x = new C();
    }
}
