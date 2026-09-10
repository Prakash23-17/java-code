//Swap two numbers using a third variable.
public class swapTwo {
    public static void main (String[] args ){
        int a = 10;
        int  b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
}
