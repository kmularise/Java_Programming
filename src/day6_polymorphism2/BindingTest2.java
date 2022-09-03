package day6_polymorphism2;

import com.sun.source.tree.ParenthesizedPatternTree;

class Parent{
    int x = 100;
    int y = 200;
    void method(){System.out.println("Parent method");}
    void showParent(){System.out.println("Parent show");}
}

class Child extends Parent{
    int x = 300;
    int z = 400;
    void method(){System.out.println("Child method");}
    void showChild(){System.out.println("Child show");}
}


public class BindingTest2 {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println("p.x:"+p.x);
        System.out.println("p.y:"+p.y);//System.out.println("p.z:"+p.z);는 error
        p.method();
        p.showParent();//p.showChild();는 error
    }
}
