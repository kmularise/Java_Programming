package day13;

class MyThread extends Thread{
    String thrdName;
    MyThread(String name){ thrdName = name;}
    public void run(){
        System.out.println(thrdName+"starting");
        try{
            for(int count =0; count<10; count++){
                Thread.sleep(400);
                System.out.println("In "+thrdName+",count is "+count);
            }
        }catch(InterruptedException ex){
            System.out.println(thrdName+"interrupted.");
        }
        System.out.println(thrdName+" terminating.");
    }
}

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting");
        Thread newThrd = new MyThread("Child #1");
        newThrd.start();
        for(int i = 0; i<50;i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch(InterruptedException ex){
                System.out.println("Main thread interrupted.");
        }
    }
        System.out.println("Main thread ending.");
    }
}
