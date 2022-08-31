package day4;

class Friend{
    private String name;
    private int year;
    {
        System.out.println("instance block");
    }

    static{
        System.out.println("static block");
    }

    Friend(){}
    Friend(String name, int year){
        this.name = name;
        this.year = year;
    }

    public void print(){
        System.out.println(name+" is my friend since "+year);

    }
}

public class FreindData {
    public static void main(String[] args) {
        Friend alice = new Friend("Alice", 2015);
        Friend paul = new Friend("Paul", 2010);
        Friend david = new Friend("David", 2013);

        alice.print();
        paul.print();
        david.print();

    }

}
