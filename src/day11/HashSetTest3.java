package day11;

import java.util.HashSet;

class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name =name; this.age = age;
    }

    public String toString(){
        return name +":"+age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    /*
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person tmp = (Person) obj;
            return name.equals(tmp.name)&&age==tmp.age;
        }
        return false;
    }
    public int hashCode(){
        return name.hashCode()+age;
    }*/
}

public class HashSetTest3 {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<Object>();
        set.add(new String("Alice"));
        set.add(new String("Alice"));
        set.add(new Person("Robert",10));
        set.add(new Person("Robert",10));
        System.out.println(set);//equals와 hashCode를 오버라이딩함으로써 Robert:10 객체가 정확히 한번 저장된다.
        //String 클래스는 이미 equals와 hasCode가 오버라이딩되어 제공된다.

    }
}
