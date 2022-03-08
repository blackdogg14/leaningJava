package demo2.pkg;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username;
        String password;
        username = "nkam";
        password = "A999";

        System.out.println("Username: ");
        Scanner Input1 = new Scanner(System.in);
        String usernameInput = Input1.next();

        System.out.println("Password: ");
        Scanner Input2 = new Scanner(System.in);
        String passwordInput = Input2.next();

        if (passwordInput.equals(password)&usernameInput.equals(username)) {
            System.out.println("Login Success!!");
            return;
        }
        else{
            System.out.println("Wrong username/password please try again");
        }
        int count = 3 ;
        for (int i = 0; i < count; i++) {
            if (passwordInput.equals(password)) {
                System.out.println("Login Success!!");
            }
            else{
                count --;
                System.out.println("Username: ");
                String user = Input1.next();
                System.out.println("Password: ");
                String pass = Input2.next();
                System.out.println("Wrong username/password please try again");
                if (count == 1) {
                    System.out.println("3 failed attempt....");
                    return;
                }
            }

        }
    }
}
