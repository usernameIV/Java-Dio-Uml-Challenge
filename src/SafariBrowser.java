import java.util.InputMismatchException;
import java.util.Scanner;

public class SafariBrowser implements WebBrowser{

    Scanner s = new Scanner(System.in);

    @Override
    public void showPage() {
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
    public void newTab() {
        System.out.println("Opening new tab!");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing tab!");
    }
}
