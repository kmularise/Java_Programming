package day4;

public class VaTest {
    static void vaTest(int ...v){
        System.out.println("number of arguments:"+v.length);
        for(int i =0; i<v.length;i++)
            System.out.println("arg"+i+":"+v[i]);
    }
    static void vaTest(String msg, int...v){
        System.out.println("msg :"+msg);
        System.out.println("number of arguments:"+v.length);
        for(int i=0; i<v.length;i++){
            System.out.println("arg"+i+":"+v[i]);
        }
    }

    public static void main(String[] args) {
        vaTest("hello",2,3);
        System.out.println("------------");
        vaTest(2,4,6,8);
        System.out.println("------------");
        vaTest();
    }
}
