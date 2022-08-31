package day1_2;

public class bitwise {
    public static void main(String[] args) {
        int a = 10, b, c;
        int x = -20, y, z;

        b = a >>1;
        c = a <<2;
        y = x >>1;
        z = x <<2;

        System.out.printf("a: %10d: %32s \n", a, Integer.toBinaryString(a));
        System.out.printf("b: %10d: %32s \n", b, Integer.toBinaryString(b));
        System.out.printf("c: %10d: %32s \n\n", c, Integer.toBinaryString(c));
        System.out.printf("x: %10d: %32s \n", x, Integer.toBinaryString(x));
        System.out.printf("y: %10d: %32s \n", y, Integer.toBinaryString(y));
        System.out.printf("z: %10d: %32s \n", z, Integer.toBinaryString(z));

    }
}
