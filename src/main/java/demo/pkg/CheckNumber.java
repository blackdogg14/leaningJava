//package demo.pkg;
//
//import java.util.Scanner;
//
//public class CheckNumber {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please Input The Number: ");
//        int num = input.nextInt();
//        if (num > 0) {
//            System.out.println("The Number is positive");
//        } else if (num < 0) {
//            System.out.println("The Number is negative");
//        } else {
//            System.out.println("The Number is 0");
//        }
//    }
//
//    public static void checkLogin(String username, String password) {
//        String usernameInput = inputUserName();
//        String passwordInput = inputPassword();
//
//        int count = 3;
//        for (int i = 0; i < count; i++) {
//            if (usernameInput.equals(username) & passwordInput.equals(password)) {
//                System.out.println("Login Success");
//                return;
//            } else {
//                count--;
//                inputUserName();
//                inputPassword();
//                System.out.println("Incorrect Try Again");
//                if (count == 3) {
//                    System.out.println("3 failed attemps made...");
//                    return;
//                }
//            }
//        }
//    }
//
//    private static String inputUserName() {
//        Scanner input = new Scanner(System.in);
//        input = new Scanner(System.in);
//        System.out.println("User: ");
//        String username = input.next();
//        return username;
//    }
//
//    private static String inputPassword() {
//        Scanner input = new Scanner(System.in);
//        input = new Scanner(System.in);
//        System.out.println("User: ");
//        String password = input.next();
//        return password;
//    }
//
//
//}
//
