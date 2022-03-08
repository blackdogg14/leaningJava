package demo2.pkg;

import java.util.Scanner;

public class Practice {
    public static void main (String[] args){
        String username;
        String password;
        username="nkam00";
        password="AA00";

        System.out.println("Username: ");
        Scanner Input1 = new Scanner(System.in);
        String usernameInput1 = Input1.next();

        System.out.println("Password: ");
        Scanner Input2 = new Scanner(System.in);
        String passwordInput2 = Input2.next();

        if (usernameInput1.equals(username) && passwordInput2.equals(password)){
            System.out.println("Login Successfully");
            return;
        }
        else {
            System.out.println("Wrong username/password Please Try Again");
        }
        int count =3;
        for (int i = 0; i < count; i++) {
            if (usernameInput1.equals(username) && passwordInput2.equals(password)) {
                System.out.println("Login Successfully");
            } else {
                count--;
                System.out.println("Username: ");
                String user = Input1.next();
                System.out.println("Password: ");
                String pass = Input2.next();
                System.out.println("Wrong username/password Please Try Again");
                if (count == 1) {
                    System.out.println("Wrong password/username attempt 3 times");
                    return;
                }


            }
        }

    }
}
