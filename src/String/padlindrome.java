package String;
//Check whether a String is palindrome or not.
public class padlindrome {
    public static void main(String[] args){

        String str = "aditya";

        String reverse = "";

        for (int i = str.length() - 1; i>=0 ; i--){
            reverse += str.charAt(i);

        }

        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
