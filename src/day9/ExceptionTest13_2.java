package day9;

public class ExceptionTest13_2 {
    static void test() throws ArithmeticException{
        int a = 5, b = 0, c;
        c = a/b;
        System.out.println("c : "+c);

    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        try{
            test();
        }catch(ArithmeticException e){
            System.out.println("catch exception");
        }
        System.out.println("Good bye");
    }
}
