import java.util.InputMismatchException;
import java.util.Scanner;

public class IPod implements MusicPlayer{

    Scanner s = new Scanner(System.in);

    @Override
    public void playSong() {
        System.out.println("The song is playing now! ");
    }
    @Override
    public void pauseSong() {
        System.out.println("The song stopped...");
    }
    @Override
    public void selectSong() {
        try {
            System.out.println("Insert the song you wanna listen: ");
            String title = s.nextLine();
            System.out.println("Picking up call from :" + title);
        }
        catch (InputMismatchException e) {
            System.out.println("That's not a title!");
        }
    }

}
