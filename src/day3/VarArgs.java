package day3;

public class VarArgs {

    static void vaTest(int ... v){
        System.out.println("number of arguments:"+v.length);
        for(int i=0;i<v.length;i++)
            System.out.println("arg"+i+":"+v[i]);
    }

    public static void main(String[] args) {
        vaTest(5);
        System.out.println("---------------");
        vaTest(2,4,6,8);
        System.out.println("---------------");
        vaTest();
        System.out.println("---------------");
    }
}
