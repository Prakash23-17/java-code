//Write a Java program to take two integers as input and print their sum.

import java.util.Scanner;

public class input {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your a: ");
        int a = sc.nextInt();

        System.out.print("Enter your b: ");
        int b = sc.nextInt();
        System.out.println("sum: "+(a+b));
    }
}
