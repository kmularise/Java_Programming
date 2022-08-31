package day4;

class Data{
    int a= 10;
    Data(){}
    Data(int x){
        a=x;
    }

    void printData(){
        System.out.println("a: "+a);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Data d1 = new Data();//default 생성자 호출 - Data(){}
        Data d2 = new Data(200);

        d1.printData();
        d2.printData();
    }
}
