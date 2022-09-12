package day9.nov;

public class Test5 {
    public static void main(String[] args) {
        int n[]=new int[4];

        try{
            System.out.println("Before exception is generated");
            n[4]=100;
            System.out.println("This line won't be displayed");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index out of bounds exception occurred");

        }finally{
            System.out.println("finally line");
        }
        System.out.println("alter try-catch");
    }
}
