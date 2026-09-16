package Pattern;

import java.util.Scanner;

public class w {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter your number :");
            int i = sc.nextInt();
            if (i % 10 ==0){
                continue;
            }
            System.out.println("your number " + i );
        }while (true);
    }
}
