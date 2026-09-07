//Write a Java program to take a number as input and determine whether it is positive, negative, or zero.

import java.util.Scanner;

public class take {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        if(n>0){

            System.out.println("Positive");
        } else if (n < 0) {

            System.out.println("Negative");
        }else {
            System.out.println("zero");
        }
    }
}
