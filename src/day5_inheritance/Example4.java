package day5_inheritance;

class AA{
    private int data1;
    AA(){}
    AA(int d1){data1 = d1;}
    void show(){System.out.println("data1: "+data1);}
}

class BB extends AA{
    private int data2;
    BB(){}
    BB(int d2){data2 =d2;}
    BB(int d1, int d2){
        super(d1);//super 키워드로 부모 생성자 호출, 생성자 제일 첫줄에 적어야 한다
        //private member가 직접 접근이 안되기 때문
        data2 = d2;
    }

    void show(){
        super.show();//부모 클래스가 가지고 있는 메소드 호출하기
        System.out.println("data2: "+data2);
    }
}

public class Example4 {
    public static void main(String[] args){
        AA a = new AA(5);
        BB b = new BB(2,4);
        a.show();
        System.out.println();
        b.show();
    }

}
