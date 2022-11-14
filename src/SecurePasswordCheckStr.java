public class SecurePasswordCheckStr {
    // instance variable
    private String password;

    // constructor
    public SecurePasswordCheckStr(String password) {
        this.password = password;
    }

    public void setPasswordCheckStr(String newPassword) {
        password = newPassword;
    }

    public boolean isSecureCheckStr() {
        return isLongEnough() && containsDigit() && containsLowercase() && containsUppercase() && containsSpecialSymbol();
    }


    public String statusCheckStr() {
        if (isSecureCheckStr()) {
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
        return checkString("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }

    private boolean containsLowercase() {
        return checkString("abcdefghijklmnopqrstuvwxyz");
    }

    private boolean containsDigit() {
        return checkString("0123456789");
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