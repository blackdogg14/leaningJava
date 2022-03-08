package demo2.pkg;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int count, num1 = 0, num2 = 1;
        System.out.println("How Many number you want to display: ");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        while (true) {
            if (count < 0) {
                System.out.println("Please input positive number only");
                System.out.println("How Many number you want to display: ");
                Scanner count1 = new Scanner(System.in);
                count = scanner.nextInt();
            }
            else {
                System.out.println("Fibonacci Chain with "+count+" number is: ");
                int i = 1;
                while (i<=count) {
                    System.out.println(num1 + " ");
                    int SumOfPreTwo = num1 + num2;
                    num1 = num2;
                    num2 = SumOfPreTwo;
                    i++;
                    return;
                }
            }
        }
        }
        }


