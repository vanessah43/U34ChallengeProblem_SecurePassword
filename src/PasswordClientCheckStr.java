import java.util.Scanner;

public class PasswordClientCheckStr {
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

        SecurePasswordCheckStr checkStr = new SecurePasswordCheckStr(password);
        boolean secure = checkStr.isSecureCheckStr();

        // checkStr
        while (!secure) {
            System.out.println(checkStr.statusCheckStr());
            System.out.println("Please try again");
            password = scanner.nextLine();
            checkStr.setPasswordCheckStr(password);
            if (checkStr.isSecureCheckStr()) {
                secure = true;
            }
        }

        if (secure) {
            System.out.println("Password is secure.");
        }
    }
}
