package day13.ThreadTest2;

class PrintNumberThread extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.print (i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        Thread t = new PrintNumberThread();
        t.start();
        for(char ch='A';ch<='Z';ch++ ){
            System.out.print(ch);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
