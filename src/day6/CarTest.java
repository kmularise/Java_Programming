package day6;

class Car{
    void drive(){System.out.println("drive..");}
    void stop(){System.out.println("stop..");}
}

class FireEngine extends Car{
    void water(){System.out.println("water..");}
}

class Ambulance extends Car{
    void siren(){System.out.println("siren..");}
}
public class CarTest {
    static void doWork(Car c){
        if (c instanceof FireEngine){
            FireEngine fe = (FireEngine) c;
            fe.water();
        }
        else if (c instanceof Ambulance){
            Ambulance a = (Ambulance) c;
            a.siren();
        }
        else{
            c.drive();
            c.stop();
        }
    }

    public static void main(String[] args) {
        Car c = new FireEngine();
        doWork(c);
        c = new Ambulance();
        doWork(c);
        c = new Car();
        doWork(c);
    }

}
