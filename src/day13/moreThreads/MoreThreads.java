package day13.moreThreads;

class MyThread implements Runnable{
    Thread thrd;
    MyThread(String name){thrd = new Thread(this, name);}
    public static MyThread createAndStart(String name){
        MyThread myThrd = new MyThread(name);
        myThrd.thrd.start();
        return myThrd;
    }

    public void run(){
        System.out.println(thrd.getName()+" starting.");
        try{
            for(int count =0; count<10; count++){
                Thread.sleep(400);
                System.out.println("In "+thrd.getName()+", count is "+count);

            }
        }catch(InterruptedException ex){
            System.out.println(thrd.getName()+" interrupted.");
        }
        System.out.println(thrd.getName()+" terminating");
    }
}

public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Main thread staring.");
        MyThread mt1 = MyThread.createAndStart("Child #1");
        MyThread mt2 = MyThread.createAndStart("Child #2");
        MyThread mt3 = MyThread.createAndStart("Child #3");
        for(int i = 0; i<50; i++){
            System.out.print(".");
            try{Thread.sleep(100);}
            catch(InterruptedException ex){
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread ending");
    }
}
