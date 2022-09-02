package day6;

class A{
    int i,j;
    A(int a, int b){
        i = a;
        j = b;
    }

    void show(){
        System.out.println("i and j: "+i+" "+j);

    }
}

class B extends A{
    int k;
    B(int a, int b, int c){
        super(a,b);
        k =c;
    }

    void show(){//overriding
        System.out.println("k : "+k);
    }
}

public class OverTest1 {
    public static void main(String[] args) {
        B ob = new B(1,2,3);
        ob.show();
    }
}
