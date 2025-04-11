import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "@#$%&*!";

        String allChars = upper + lower + numbers + symbols;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        StringBuilder password = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        System.out.println("Generated Password: " + password.toString());
        sc.close();
    }
}
