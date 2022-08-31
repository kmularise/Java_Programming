package day4;
//인스턴스를 만들어서 인스턴스를 통해 메소드를 호출하는 경우
import java.lang.reflect.Method;

public class Method1TestVer1 {
    int a = 100;
    void printData(){
        System.out.println("a:"+a);
    }

    public static void main(String[] args) {
        Method1TestVer1 m1 = new Method1TestVer1();
        Method1TestVer1 m2 = new Method1TestVer1();

        m1.printData();
        m2.printData();
        m2.a = 200;

        m1.printData();
        m2.printData();
    }
}
