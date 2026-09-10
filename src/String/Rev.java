package String;
//Reverse a String without using reverse().
public class Rev {

    public static void main(String[] args){
        String str = "PRAKASH ";
        String reverse = "";

        for (int i = str.length() - 1; i >=0 ; i--){
            reverse += str.charAt(i);

        }
        System.out.println(reverse);
    }
}
