package day9;

public class AutoboxTest {
    static void m(Integer v){
        System.out.println("m() received "+v);
    }
    static int m2(){
        return 10;
    }
    static Integer m3(){
        return 99;//autoboxing 99 into an Integer
    }

    public static void main(String[] args) {
        m(199);
        Integer iOb = m2();//autoboxing
        System.out.println("return valueof m2(): "+iOb);

        int i = m3(); //auto-unboxing
        System.out.println("return value of m3():"+i);

        iOb = 100;
        System.out.println("square root of iOb: "+Math.sqrt(iOb));
    }
}
