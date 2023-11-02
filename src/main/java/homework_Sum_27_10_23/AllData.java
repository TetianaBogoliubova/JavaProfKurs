package homework_Sum_27_10_23;

public class AllData {
    private final String login;
    private final String password;
    private final String confirmPassword;

    public AllData(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "AllData{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}
// 1 уровень сложности: Exceptions. Проверка логина и пароля
//Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//Длина login должна быть меньше 20 символов.
//Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//Password должен содержать только латинские буквы, цифры и знак подчеркивания.
//Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
//Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами
//– один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
//Обработка исключений проводится внутри метода.
//Iспользуем multi-catch block. Метод возвращает true, если значения верны или false в другом случае.
//Пример вызова метода:
//checkLoginAndPassword(john, 123, 123) --> true
//checkLoginAndPassword(john, 123, 1234) --> false
//checkLoginAndPassword(john, 123@, 123@) --> false
//checkLoginAndPassword(john@, 123, 123) --> false