package day10;

class TwoGen<T,V>{
    T ob1;
    V ob2;
    TwoGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }
    void showTypes(){
        System.out.println("Type of T :"+ob1.getClass().getName());
        System.out.println("Type of V :"+ob2.getClass().getName());
    }
    T getob1(){return ob1;}
    V getobv2(){return ob2;}
}

public class Test2 {
    public static void main(String[] args) {
        TwoGen<Integer, String> x = new TwoGen<Integer, String>(55,"Hello");
        x.showTypes();

        int v = x.getob1();
        System.out.println("value:"+v);

        String w  = x.getobv2();
        System.out.println("value :"+w);

    }
}
