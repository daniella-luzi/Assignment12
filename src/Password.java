import java.util.Scanner;

public class Password {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello! Are you ready to see if your password is valid?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();
        scanner.close();
        boolean isValid = yourPassword(password);
        if (isValid) {
            System.out.println("Valid.");
        } else {
            System.out.println("Invalid.");
        }
    }

    public static boolean passwordLength(String password) {
        if (password.length() < 8) {
            return false;
        }
        if (password.length() > 16) {
            return false;
        }
        else {
            return true;
        }
        }

    public static boolean passwordUpper(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean passwordLower(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean passwordNumbers(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean passwordSpecial(String password) {
        for (int i = 0; i < password.length(); i++) {
          if ("~!@#$%^&*()-=+_".indexOf(password.charAt(i)) >= 0) {
                return true;
          }
        }
        return false;
    }

    public static boolean yourPassword(String password) {
           if (passwordLength(password) && passwordLower(password) && passwordUpper(password) && passwordNumbers(password) && passwordSpecial(password)) {
               return true;
           }
          if (passwordLength(password) && passwordLower(password) && passwordUpper(password) && passwordNumbers(password)) {
              return true;
           }
           if (passwordLength(password) && passwordLower(password) && passwordUpper(password) && passwordSpecial(password)) {
               return true;
           }
           if (passwordLength(password) && passwordLower(password) && passwordNumbers(password) && passwordSpecial(password)) {
               return true;
           }
           if (passwordLength(password) && passwordUpper(password) && passwordNumbers(password) && passwordSpecial(password)) {
               return true;
           }
           else {
               return false;
           }
    }
}

