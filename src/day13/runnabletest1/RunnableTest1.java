package day13.runnabletest1;

class PrintNumber implements Runnable{
    public void run(){
        for (int i=0;i<10;i++) {
            System.out.print(i);
        }
    }
}

public class RunnableTest1 {
    public static void main(String[] args) {
        Thread t = new Thread(new PrintNumber());
        t.start();
        for(char ch = 'a';ch<='z';ch++)
            System.out.print(ch);
    }
}
