package day10;

public class ArrayTest1 {
    public static void main(String[] args) {
        String A[] = new String[]{"January", "February","March","April","May"};
        for (String s : A){
            System.out.println(s);
        }
        A[5] = new String("June");
        for (String s : A){
            System.out.println(s);
        }
    }
}
