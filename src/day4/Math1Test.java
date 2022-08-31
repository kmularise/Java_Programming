package day4;

class Math1{
    //인스턴스 메소드(반드시 인스턴스를 통해서 호출한다.)
    long plus(long a, long b){return a+b;}
    long minus(long a, long b){return a-b;}
    long multiply(long a, long b){return a*b;}
    long divide(long a, long b){return a/b;}
}

public class Math1Test {
    public static void main(String[] args) {
        Math1 m = new Math1();
        long a = 200L, b = 23L;
        long w, x, y, z;
        w = m.plus(a,b);
        x = m.minus(a,b);
        y = m.multiply(a,b);
        z = m.divide(a,b);

        System.out.println("w :"+w);
        System.out.println("x :"+x);
        System.out.println("y :"+y);
        System.out.println("z :"+z);
    }
}
