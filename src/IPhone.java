import java.util.InputMismatchException;
import java.util.Scanner;

public class IPhone implements Phone{

    Scanner s = new Scanner(System.in);
    @Override
    public void call() {
        try {
            System.out.println("Insert the number you wanna call: ");
            long number = s.nextLong();
            System.out.println("Calling:" + number);
        }
        catch (InputMismatchException e) {
            System.out.println("That's not a number!");
        }

    }
    @Override
    public void pickUpCall() {
        System.out.println("Picking up call from (81) 94002-8922");
    }
    @Override
    public void sendSMS() {
        System.out.println("Sending message to: (81) 94002-8922...");
    }
}
