package day7;

interface AA{
    int a = 10;
}

interface BB{
    int b = 20;
}

class CC implements AA, BB{
    int c = 30;
    void print(){
        System.out.println("a:"+a+",b:"+b+",c:"+c);
    }
}

public class InterfaceTest1 {
    public static void main(String[] args) {
        CC x = new CC();
        x.print();
    }

}
