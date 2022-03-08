package demo.pkg;

import java.util.Scanner;

public class CheckInput {
    public static void main(String[] args) {
        System.out.println("Enter The Number: ");
        Scanner scanner= new Scanner(System.in);
        if(scanner.hasNextInt()) {
            System.out.println("The Number is an integer");
        }
        else{
            System.out.println("The Number isn't an integer");
        }
    }


}
