//A student gets marks. Print the grade according to the following rules:

//90+  → A
//70-89 → B
//50-69 → C
//35-49 → D
//Below 35 → Fail

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class grade {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your marks :");
        int marks = sc.nextInt();
        
        if (marks>=90){
            System.out.println("Grade A");
        } else if (marks>= 70) {
            System.out.println("Grade B");
        } else if (marks>= 50) {
            System.out.println("Grade c");
        } else if (marks>= 35) {
            System.out.println("Grade D");
        }else {
            System.out.println("Fail");
        }
    }
}
