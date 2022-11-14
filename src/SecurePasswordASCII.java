public class SecurePasswordASCII {
    // instance variable
    private String password;

    // constructor
    public SecurePasswordASCII(String password) {
        this.password = password;
    }

    public void setPasswordASCII(String newPassword) {
        password = newPassword;
    }

    public boolean isSecureASCII() {
        return isLongEnough() && containsDigit() && containsLowercase() && containsUppercase() && containsSpecialSymbol();
    }

    public String statusASCII() {
        if (isSecureASCII()) {
            return "Password is secure.";
        } else {
            String statement = "";
            if (!isLongEnough()) {
                statement += "> The password must be at least 8 characters.\n";
            }
            if (!containsUppercase()) {
                statement += "> The password must contain an uppercase letter.\n";
            }
            if (!containsLowercase()) {
                statement += "> The password must contain a lowercase letter.\n";
            }
            if (!containsDigit()) {
                statement += "> The password must contain a digit.\n";
            }
            if (!containsSpecialSymbol()) {
                statement += "> The password must contain one of the following symbols: ! @ # $ % ^ & * ? \n";
            }
            return statement;
        }
    }

    private boolean isLongEnough() {
        return password.length() >= 8;
    }

    private boolean containsUppercase() {
        char check;
        int ascii;
        for (int count = 0; count < password.length(); count++) {
            check = password.charAt(count);
            ascii = (int) check;
            if (ascii >= 65 && ascii <= 90) {
                return true;
            }
        }
        return false;
    }

    private boolean containsLowercase() {
        char check;
        int ascii;
        for (int count = 0; count < password.length(); count++) {
            check = password.charAt(count);
            ascii = (int) check;
            if (ascii >= 97 && ascii <= 122) {
                return true;
            }
        }
        return false;
    }

    private boolean containsDigit() {
        char check;
        int ascii;
        for (int count = 0; count < password.length(); count++) {
            check = password.charAt(count);
            ascii = (int) check;
            if (ascii >= 48 && ascii <= 57) {
                return true;
            }
        }
        return false;
    }

    private boolean containsSpecialSymbol() {
        char check;
        int ascii;
        for (int count = 0; count < password.length(); count++) {
            check = password.charAt(count);
            ascii = (int) check;
            if ((ascii >= 33 && ascii <= 38 && ascii != 34) || ascii == 42 || ascii == 63 || ascii == 64 || ascii == 94) {
                return true;
            }
        }
        return false;
    }

    // checkString method not implemented in this version
}
