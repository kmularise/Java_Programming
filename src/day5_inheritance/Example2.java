package day5_inheritance;

class Shape{
    private double height;
    private double width;

    double getHeight(){return height;}//accessor
    double getWidth(){return width;}

    void printShape(){
        System.out.println("height: "+height+", width :"+width);
    }
}

class Rectangle extends Shape{
    private String type;//직사각형, 정사각형

    double area(){
        return getHeight()*getWidth();
    }

}

public class Example2 {
}
