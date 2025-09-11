package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo2 {
    public void divide() throws ArithmeticException, FileNotFoundException{
            FileReader fr = new FileReader("abc.txt");
            int a = 7, b = 0, c = a / b;
    }

    public static void main(String[] args) throws FileNotFoundException{
        ExceptionDemo2 ed = new ExceptionDemo2();
        try{
            ed.divide();
        }
        catch(FileNotFoundException e){
            System.out.println("Exception is handled");
        }
    }
}
