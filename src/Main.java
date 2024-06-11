import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        IPhone phone = new IPhone();
        IPod iPod = new IPod();
        WebBrowser safari = new SafariBrowser();

        Scanner scanner_d = new Scanner(System.in);
        Scanner scanner_l = new Scanner(System.in);

        System.out.println("Welcome to the library system");
        boolean exit = false;
        do {
            try {
                System.out.println("=======================");
                System.out.println("==     Main Menu     ==");
                System.out.println("=======================");
                System.out.println(" 1 ⮞ Phone matters");
                System.out.println(" 2 ⮞ Music player matters");
                System.out.println(" 3 ⮞ Browser matters");
                System.out.println(" 0 ⮞ Quit");

                int escolha = scanner_d.nextInt();
                boolean exitSub = false;
                switch (escolha) {
                    case 1:
                        while (!exitSub) {
                            try {
                                System.out.println(" ⮞ Phone matters");
                                System.out.println(" 1. Call number");
                                System.out.println(" 2. PickUp call");
                                System.out.println(" 3. Send sms   ");
                                System.out.println(" 0. Quit");

                                int subChoice = scanner_d.nextInt();
                                switch (subChoice) {
                                    case 1:
                                        phone.call();
                                        break;
                                    case 2:
                                        phone.pickUpCall();
                                        break;
                                    case 3:
                                        phone.sendSMS();
                                        break;
                                    case 0:
                                        System.out.println("Back to main menu! :D");
                                        exitSub = true;
                                        break;
                                    default:
                                        System.out.println("Invalid option");
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input, please try again.");
                                scanner_d.next();
                            }
                        }
                        break;
                    case 2:
                        while (!exitSub) {
                            try {
                                System.out.println();
                                System.out.println(" ⮞ Music matters   ");
                                System.out.println(" 1. Play song      ");
                                System.out.println(" 2. Pause song     ");
                                System.out.println(" 3. Select song    ");
                                System.out.println(" 0. Quit           ");

                                int Sub = scanner_d.nextInt();
                                switch (Sub) {
                                    case 1:
                                        iPod.playSong();
                                        break;
                                    case 2:
                                        iPod.pauseSong();
                                        break;
                                    case 3:
                                        iPod.selectSong();
                                        break;
                                    case 0:
                                        System.out.println("Back to main menu! :D");
                                        exitSub = true;
                                        break;
                                    default:
                                        System.out.println("Invalid option");
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input, please try again.");
                                scanner_d.next();
                            }
                        }
                        break;
                    case 3: {
                        while (!exitSub) {
                            try {
                                System.out.println();
                                System.out.println(" ⮞ Browser matters   ");
                                System.out.println(" 1. Show page        ");
                                System.out.println(" 2. New tab          ");
                                System.out.println(" 3. Refresh tab ");
                                System.out.println(" 0. Quit                ");

                                int Sub = scanner_d.nextInt();
                                switch (Sub) {
                                    case 1:
                                        safari.showPage();
                                        break;
                                    case 2:
                                        safari.newTab();
                                        break;
                                    case 3:
                                        safari.refreshPage();
                                        break;
                                    case 0:
                                        System.out.println("Back to main menu! :D");
                                        exitSub = true;
                                        break;
                                    default:
                                        System.out.println("Invalid option");
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input, please try again.");
                                scanner_d.next();
                            }
                        }
                        break;
                    }
                    case 0:
                        System.out.println("Exiting...");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option");
                }

            } catch (InputMismatchException e) {
                System.out.println("That's not an option");
                scanner_l.next();
            }
        } while (!exit);


    }
}