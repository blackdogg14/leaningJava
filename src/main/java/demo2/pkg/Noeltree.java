package demo2.pkg;

import java.util.Scanner;

public class Noeltree {
    public static void main(String[] args) {
        int height;
        System.out.println("Please input positive number: ");
        Scanner scanner = new Scanner(System.in);
        height = scanner.nextInt();
        for (int i=1; i <= height; i++) {
            for (int space=1; space<=height-i; space++) {
                System.out.print(" ");
            }
            for (int star=1; star<=i*2-1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}