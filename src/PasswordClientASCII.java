import java.util.Scanner;

public class PasswordClientASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a secure password that meets these requirements:");
        System.out.println("- Is at least 8 characters long");
        System.out.println("- Contains at least one uppercase letter");
        System.out.println("- Contains at least one lowercase letter");
        System.out.println("- Contains at least one numeric digit");
        System.out.println("- Contains at least one of these symbols: ! @ # $ % ^ & * ?");
        System.out.print("\nEnter your secure password: ");
        String password = scanner.nextLine();

        SecurePasswordASCII ascii = new SecurePasswordASCII(password);
        boolean secure = ascii.isSecureASCII();

        // ascii
        while (!secure) {
            System.out.println(ascii.statusASCII());
            System.out.println("Please try again");
            password = scanner.nextLine();
            ascii.setPasswordASCII(password);
            if (ascii.isSecureASCII()) {
                secure = true;
            }
        }


        if (secure) {
            System.out.println("Password is secure.");
        }
    }
}