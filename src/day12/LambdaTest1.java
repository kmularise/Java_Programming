package day12;

interface MyValue{
    double getValue(); // no parameterb
}
public class LambdaTest1 {
    public static void main(String[] args) {
        MyValue mv; //MyValue 참조 변수 생성
        mv = () -> 98.6; // 지연 처리
        System.out.println(mv.getValue());
    }
}
