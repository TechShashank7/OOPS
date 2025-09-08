package Exception_Handling;

public class ExceptionDemo {
    public static void main(String[] args){
        try{ //Risky code in try
            int a=3,b=0,c=a/b;
            System.out.println("The result is "+c);
        }
        catch (ArithmeticException e){
            System.out.print("Error: Division by zero is not allowed.");
        }
        catch (NullPointerException e){ //if first catch block  doesnt satisfy the exception then go to this block
            System.out.print("Caught a NullPointerException!");
        }

    }
}
