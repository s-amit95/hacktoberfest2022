import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    private static final String ALPHA_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUM = "0123456789";
    private static final String SPL_CHARS = "!@#$%^&*_=+-/";


    public static void main(String[] args) {
        System.out.println("Welcome to the password generator!");
        System.out.println("Do you want to use capitals? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String caps = scanner.nextLine();
        System.out.println("Do you want to use numbers? (y/n)");
        String numbers = scanner.nextLine();
        System.out.println("Do you want to use special characters? (y/n)");
        String special = scanner.nextLine();
        System.out.println("How long do you want your password to be?");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Your password is: " + generatePassword(length, caps.equals("y"), numbers.equals("y"), special.equals("y")));
    }
    
    public static String generatePassword(int length, boolean hasCaps, boolean hasNum, boolean hasSplChars) {
        if (length < 1) {
            System.out.println("Length cannot be less than 1");
            return "";
        }

        StringBuilder password = new StringBuilder();
        StringBuilder usableChars = new StringBuilder();
        if (hasCaps) {
            usableChars.append(ALPHA_CAPS);
        }
        if (hasNum) {
            usableChars.append(NUM);
        }
        if (hasSplChars) {
            usableChars.append(SPL_CHARS);
        }
        usableChars.append(ALPHA);
        System.out.println(usableChars);
        for (int i = 0; i < length; i++) {
            password.append(getRandomCharFromString(usableChars.toString()));
        }
        return password.toString();
    }

    public static char getRandomCharFromString(String str) {
        Random rnd = new Random();
        return str.charAt(rnd.nextInt(str.length()));
    }
}
