package io.smacs;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int n =100 ; // numbers
        int m = 200;
        String name = "java"; // sequence of characters
        boolean isDone = true;
        float value = 2.5f; //decimal
        long l = 123456; // big numbers
        double d = 25.68; //decimal
        char c = 'a'; // single char or unicode

//        System.out.println("Hello world");
//        System.out.println(n);
//        System.out.println(name);
//        System.out.println(isDone);

        int sum = n+m;
        double sum1 = n+d;
        System.out.println("Sum of n and m is " + sum1);

//        String Concatenation

        String str = "Hello";
        String str1 = "Java";

        String str2 = str + " " +str1 + " " +123;

        System.out.println(str2);


    }


}
