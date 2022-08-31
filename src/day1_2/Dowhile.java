package day1_2;

public class Dowhile {
    public static void main(String[] args) {
        int a=1, sum=0;
        do{
            sum+=a;
            a++;
        }while(a<=10);

        System.out.println("a:"+a+", sum:"+sum);
    }
}
