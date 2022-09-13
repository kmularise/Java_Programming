package day10;

public class ExceptionTest11 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        try{
            System.out.println("Before exception");
            Exception e = new Exception("고의로 발생시킴");//Exception 객체 e 생성
            throw e;//예외 발생
        }catch(Exception e){
            System.out.println("에러메시지:"+e.getMessage());
            e.printStackTrace();
        }
    }
}
