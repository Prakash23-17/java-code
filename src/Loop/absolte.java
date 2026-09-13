package Loop;
//
//Given an integer, print its absolute value.
//Examp

import java.util.Scanner;

public class absolte {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you number");
        int a = sc.nextInt();

        if (a<0){
            a=-a;
        }
        System.out.println("value" + a);
    }
}
