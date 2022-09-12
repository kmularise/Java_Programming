package day9.nov;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test9 {
    public static void main(String[] args) {
        try{
            FileReader r = new FileReader("data.txt");
        }catch(FileNotFoundException f){
            System.out.println("error!");
        }
    }
}
