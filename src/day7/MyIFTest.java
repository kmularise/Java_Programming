package day7;
interface MyIF{
    int getUserID();
    default int getAdminID(){return 0;}
    static int getUniversalID(){return 0;}
}

class Test implements MyIF{
    public int getUserID(){
        return 100;
    }

}

public class MyIFTest {
    public static void main(String[] args) {
        Test m = new Test();
        System.out.println("UserID : "+m.getUserID());
        System.out.println("AdminID : "+m.getAdminID());
        System.out.println("UniversalID : "+MyIF.getUniversalID());

    }
}
