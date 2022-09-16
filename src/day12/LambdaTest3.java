package day12;
interface MyValue3{
    double getValue();
}

interface MyParamValue{
    double getValue (double v);
}

public class LambdaTest3 {
    public static void main(String[] args) {
        MyValue3 m;
        m = ()->15.3;
        System.out.println("1: "+m.getValue());

        MyParamValue p = (n) -> 1.0/n;
        System.out.println("2: "+p.getValue(4.0));
        System.out.println("3: "+p.getValue(8.0));

    }
}
