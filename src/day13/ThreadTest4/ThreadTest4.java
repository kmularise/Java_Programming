package day13.ThreadTest4;

class MyThread implements Runnable{
    String name;
    MyThread(String name){
        this.name =name;
    }
    public void run(){
        System.out.println(name+" starting");
        try{
            for(int i=0; i<10;i++){
                Thread.sleep(300);
                System.out.println("In "+name+", count is"+i);
            }
        }catch(InterruptedException e){
            System.out.println(name+" interrupted");
        }
        System.out.println(name+" terminating");
    }
}

public class ThreadTest4 {
    public static void main(String[] args) {
        System.out.println("Main thread starting");
        MyThread mt = new MyThread("Child #1");
        Thread nt = new Thread(mt);
        nt.start();
        for(int i=0;i<50;i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println("Main interrupted");
            }
        }
        System.out.println("main thread ending ");
    }
}
