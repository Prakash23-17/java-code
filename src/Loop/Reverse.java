package Loop;
//Reverse a number using a while loop.
public class Reverse {
    public static void main(String[] args){
        int n = 23456;
        int r = 0;

        while(n>0) {
            int digit = n%10;
            r = r *10 +digit;

            n = n/10;
        }
        System.out.println(r);
    }
}
