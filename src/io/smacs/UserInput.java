package io.smacs;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input);

    }
}
