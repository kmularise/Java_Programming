package day9;

class ExcTest{
    static void getException(){
        int nums[] = new int[4];
        System.out.println("Before exception is generated");
        nums[5] = 100;
        System.out.println("this won't be displayed");
    }
}

public class ExceptionTest9 {
    public static void main(String[] args) {
        try {
            ExcTest.getException();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Standard message");
            System.out.println(ex);
            System.out.println("\nStack trace : ");
            ex.printStackTrace();
        }
        System.out.println("After catch statement");
    }
}
