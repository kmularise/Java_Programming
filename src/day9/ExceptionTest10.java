package day9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest10 {
    public static void main(String[] args) {
        try{
            FileReader r = new FileReader("data.txt");
            r.close();
        }catch(FileNotFoundException e){
            System.err.println("file not found");
        }catch(IOException e){
            System.err.println("IO error");
        }
    }
}
