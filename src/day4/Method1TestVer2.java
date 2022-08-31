package day4;
//static 메소드에서는 static 멤버만 호출할 수 있다.

public class Method1TestVer2 {

    static int a = 100;
    static void printData(){
        System.out.println("a:"+a);
    }

    public static void main(String[] args) {
        printData();
        printData();
        a = 200;
        printData();
        printData();
    }
}
