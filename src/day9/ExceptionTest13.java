package day9;

public class ExceptionTest13 {
    static void test(){
        int a =5, b=0, c;
        try{
            c = a/b;
            System.out.println("c : "+c);
        }catch(ArithmeticException e){
            System.out.println("catch exception");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        test();
        System.out.println("Good bye");
    }
}


