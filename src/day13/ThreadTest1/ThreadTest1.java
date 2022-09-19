package day13.ThreadTest1;

class PrintNumberThread extends Thread{
    public void run(){
        for(int i = 0; i<10; i++)
            System.out.print(i);
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
        Thread t = new PrintNumberThread();
        t.start();//반드시 start로 해야함 run 안됨.
        for (char ch = 'A'; ch <= 'Z';ch++) {
            System.out.print(ch);
        }
    }
}
