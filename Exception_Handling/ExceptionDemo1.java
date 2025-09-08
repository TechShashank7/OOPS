package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo1 {
    public void divide(){
        int a = 7,b = 0, c = a / b;
    }

    public static void main(String[] args) {
        ExceptionDemo1 ed = new ExceptionDemo1();
        try{
            ed.divide();
        }
        catch(ArithmeticException e){
            System.out.println("Exception handled");
        }
        try {
            FileReader fr = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.toString()); //Prints exception name and its description
            System.out.println(e.getMessage()); //Prints only exception's description
        }
    }
}
