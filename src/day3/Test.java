package day3;

class Book{
    String title;
    int year;

    void print(){
        System.out.println(title + ", "+year);
    }
}
public class Test {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();

        b1.title = "Java";
        b1.year = 2019;

        b2.title = "Python";
        b2.year = 2018;

        b1.print();
        b2.print();
    }
}
