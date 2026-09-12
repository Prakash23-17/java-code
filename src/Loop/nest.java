package Loop;

import java.util.Scanner;

public class nest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Are you graduate? (true/false): ");
        boolean graduate = sc.nextBoolean();

        if (age >= 18) {

            if (graduate) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible - Qualification required");
            }

        } else {
            System.out.println("Not Eligible - Age requirement");
        }
    }
}