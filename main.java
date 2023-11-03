#Update
import java.io.IOException;

public class Main {

    public Main() {
        detekos();
    }

    public void menu() {
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println(";       S P A M  S M S      ;");
        System.out.println(";---------------------------;");
        System.out.println(";       Author: FreeCode    ;");
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;");

        System.out.println("NOTE: This tool's only work for Indonesia phone numbers.");
        System.out.println("1. SMS Gratis");
        System.out.println("2. OTP Matahari");
        System.out.println("3. OTP Hallodok");
        System.out.println("4. OTP Olx.co.id");
        System.out.println("5. OTP Sociolla.com");

        try {
            int pilih = Integer.parseInt(System.console().readLine("noobie/> "));
            switch (pilih) {
                case 1:
                    // Add your SMS Gratis functionality here
                    break;
                case 2:
                    // Add your OTP Matahari functionality here
                    break;
                case 3:
                    // Add your OTP Hallodok functionality here
                    break;
                case 4:
                    // Add your OTP Olx.co.id functionality here
                    break;
                case 5:
                    // Add your OTP Sociolla.com functionality here
                    break;
                default:
                    System.out.println("[!] lihat menu dong(o)");
                    menu();
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("[!] Invalid input");
            menu();
        }
    }

    public void detekos() {
        // Remove cache (You may need to implement this)
        try {
            // Code to remove cache
        } catch (Exception e) {
            // Handle exceptions
        }

        // Clear the screen based on the operating system (You may need to implement this)
        try {
            // Code to clear the screen
        } catch (IOException e) {
            // Handle exceptions
        }
        menu();
    }

    public static void main(String[] args) {
        try {
            new Main();
        } catch (Exception e) {
            System.out.println("Err: " + e.getMessage());
        }
    }
}
