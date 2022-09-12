package day9.nov;

public class Test {
    public static void main(String[] args) {
        int A[] = {1,2,3};
        for (int i = 0; i <=A.length; i++)
            System.out.println(A[i]);
    }
}
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        at day9.nov.Test.main(Test.java:7) : Runtime Error*/