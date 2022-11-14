import java.util.Scanner;

public class PasswordClientSynthesized {
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

        SecurePasswordSynthesized synthesized = new SecurePasswordSynthesized(password);
        boolean secure = synthesized.isSecureSynthesized();

        // synthesized
        while (!secure) {
            System.out.println(synthesized.statusSynthesized());
            System.out.println("Please try again");
            password = scanner.nextLine();
            synthesized.setPasswordSynthesized(password);
            if (synthesized.isSecureSynthesized()) {
                secure = true;
            }
        }


        if (secure) {
            System.out.println("Password is secure.");
        }
    }
}
