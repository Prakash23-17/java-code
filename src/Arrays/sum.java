package Arrays;
//Find the sum of all elements of an array.
public class sum {

    public static void main(String[] args){
        int[] arr = {4,5,3,45};
        int sum = 0 ;

        for (int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum:"+sum);
    }

}
