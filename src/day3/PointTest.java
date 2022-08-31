package day3;
class Point{
    int x;
    int y;
    /*
    member variable(멤버변수)
    instance variable(인스턴스 변수)
    field(필드)
    */

    void print(){
        System.out.println("("+x+","+y+")");
        /*
        member function (멤버 함수)
        method (메소드)
         */
    }

    void change(int a, int b){
        x = a;
        y = b;
    }

}

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x =5;
        p1.y =7;
        p2.x =100;
        p2.y = 80;
        p1.print();
        p2.print();
        p1.change(20,30);
        p1.print();
    }

}
