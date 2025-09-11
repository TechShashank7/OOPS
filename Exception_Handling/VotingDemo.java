package Exception_Handling;
import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

class Voting {
    public void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You aren't eligible to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }
}

public class VotingDemo {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        Voting v = new Voting();
        try {
            v.checkEligibility(age);
        }
//        catch (InvalidAgeException e) {
//            System.out.println(e.getMessage());
//        }
        finally{ //Finally block will always run irrespective of whether exception is encountered or not
            System.out.println("2");
        }
    }
}
