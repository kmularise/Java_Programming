package day10;

class Foo<T extends Number>{
    T num;
    Foo (T n){num =n;}

    boolean same (Foo<?> ob){
        if(Math.abs(num.doubleValue())==Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }
}

public class Test5 {
    public static void main(String[] args) {
        Foo<Float> x = new Foo<Float>(2.5f);
        Foo<Double> y = new Foo<Double>(-2.5);

        if(x.same(y)) System.out.println("same");//에러 발생
        else System.out.println("different");
    }
}
