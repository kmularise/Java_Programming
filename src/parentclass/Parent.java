package parentclass;

public class Parent {
    private String name;
    private int age;

    public Parent(){}
    public Parent(String name, int age){
        this.name = name;
        this.age = age;
    }

    protected String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
