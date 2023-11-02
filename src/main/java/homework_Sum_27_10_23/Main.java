package homework_Sum_27_10_23;

public class Main {
    public static void main(String[] args) {

        Methods methods = new Methods();

        System.out.println(methods.inputAllData("john", "123", "123"));
        System.out.println(methods.inputAllData("john", "123", "1234"));
        System.out.println(methods.inputAllData("john", "123@", "123@"));
        System.out.println(methods.inputAllData("john@", "123", "123"));
    }
}
