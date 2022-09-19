package day13.ThreadTest3;

class PrintNumberThread extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.print(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class PrintCharThread extends Thread{
    public void run(){
        for(char ch = 'a';ch<='z';ch++){
            System.out.print(ch);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}



public class ThreadTest3 {
    public static void main(String[] args) {
        Thread t1 = new PrintNumberThread();
        Thread t2 = new PrintCharThread();
        t1.start();
        t2.start();

        for(char ch='A';ch<='Z';ch++){
            System.out.print(ch);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
