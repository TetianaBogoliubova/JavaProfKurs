package homework_Sum_27_10_23;

public class Methods {
    public boolean inputAllData(String login, String password, String confirmPassword) {
        try {
            if (!checkLogin(login)) {
                throw new WrongLoginException("Login is incorrect");
            }
            if (!checkPassword(password)) {
                throw new WrongPasswordException("Password is incorrect");
            }
            if (!password.equals(confirmPassword)) {
                return false;
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean checkLogin(String login) {
        if (login.matches("^[a-zA-Z0-9_]+$") && (login.length() <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkPassword(String password) {
        if (password.matches("^[a-zA-Z0-9_]+$") && (password.length() <= 20)) {
            return true;
        } else {
            return false;
        }
    }
}

