import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String t = scanner.next();
        System.out.println("Введите пароль");
        String w = scanner.next();
        System.out.println("Подтвердите пароль");
        String v = scanner.next();
        Registration(t,w,v);
        }


    public static boolean Registration(String login ,String password, String ConfirmPassword) {

        try {
            if (!(login.matches("[a-zA-Z0-9_]+")) && !(login.length() < 20)) {
                throw new  WrongLoginException("Ошибка ввода логина");
            }
            if (!(password.matches("[a-zA-Z0-9_]+")) && !(password.length() < 20)) {
                throw new WrongPasswordException("Ошибка ввода пароля");
            }
            if (!password.equals(ConfirmPassword)){
                throw new WrongPasswordException("Пароли не совпадают");
            }
            return true;
        }
        catch (WrongLoginException | WrongPasswordException e){
           System.out.println( e.getMessage());
           return false;
        }




    }
    static class WrongLoginException extends Exception{
        public WrongLoginException(String message){
            super(message);
        }

    }
    static class WrongPasswordException extends Exception{
        public WrongPasswordException (String message){
            super(message);
        }
    }
}

