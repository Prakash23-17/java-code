package Functions;

public class value {

    static void change(int[] arr) {
        arr[0] = 100;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        change(arr);
        System.out.println(arr[0]);
    }
}
