package day12;

interface MyValue2{
    //two parameters
    double getValue(double a, double b);
}
public class LambdaTest2 {
    public static void main(String[] args) {
        MyValue2 myVal;
        myVal = (a,b) -> a*b;
        System.out.println(myVal.getValue(2.0,4.5));

        myVal = (a,b)-> a/b;
        System.out.println(myVal.getValue(100.0,11.5 ));
    }
}
