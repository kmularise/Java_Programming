package childclass;
import parentclass.Parent;

public class Child extends Parent{
    private char rank;
    Child(){}
    Child(String name, int age, char rank){
        super(name,age);
        this.rank =rank;
    }

    public void show(){
        System.out.println(getName());

        //System.out.println(getName()+" : "+getAge()+", "+rank ); protected와 default 구분
    }
}
