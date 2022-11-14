public class SecurePasswordSynthesized {
    // instance variable
    private String password;

    // constructor
    public SecurePasswordSynthesized(String password) {
        this.password = password;
    }

    public void setPasswordSynthesized(String newPassword) {
        password = newPassword;
    }

    public boolean isSecureSynthesized() {
        return isLongEnough() && containsDigit() && containsLowercase() && containsUppercase() && containsSpecialSymbol();
    }

    public String statusSynthesized() {
        if (isSecureSynthesized()) {
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



    /* private helper methods */
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
        return checkString("!@#$%^&*?");
    }

    private boolean checkString(String characterString) {
        for (int count = 0; count < password.length(); count++) {
            for (int charCount = 0; charCount < characterString.length(); charCount++) {
                if (password.charAt(count) == characterString.charAt(charCount)) {
                    return true;
                }
            }
        }
        return false;
    }
}