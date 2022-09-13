package day10;
//Generic class 라고 함
//Generic에서는 객체 생성 시 type이 정해진다.
class Gen<T>{
    T ob;
    Gen(T o){ob = o;}
    T getob(){return ob;}
    void showType(){
        System.out.println("Type of T is "+ob.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);//Generic class의 객체 생성
        iOb.showType();
        int v = iOb.getob();
        System.out.println("value : "+v);
        System.out.println();
        Gen<String> strOb = new Gen<String>("Generics Test");//Generic class의  객체 생성
        strOb.showType();
        String str = strOb.getob();
        System.out.println("value : "+str);
    }
}
