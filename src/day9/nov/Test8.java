package day9.nov;

public class Test8 {
    public static void main(String[] args) {
        int num1 = 2, num2 = 0;
        try{
            int result = num1 / num2;
            System.out.println(result);
        }catch(ArithmeticException e){
            String str = e.getMessage();
            System.err.println(str);

            e.printStackTrace();
        }
    }
}
