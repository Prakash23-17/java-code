import java.util.Scanner;

//Take two numbers and print their addition, subtraction, multiplication and division.
public class all {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you first number;");
        double a = sc.nextInt();

        System.out.println("Enter your second number:");
        double b = sc.nextInt();

        System.out.println("Add="+ (a+b));
        System.out.println("Sub=" + (a -b ));
        System.out.println("multiple=" +(a*b));
        System.out.println("Divide" + (a/b));
    }
}
