//Write a Java program to check whether a number is even or odd.

import java.util.Scanner;

public class even {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:");
        int n = sc.nextInt();

        if (n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
