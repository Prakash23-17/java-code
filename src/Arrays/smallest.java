package Arrays;
//Find the smallest element in an array.
public class smallest {

    public static void main (String[] args){

        int[]arr = {3,56,4,5};
        int smallest = arr[0];

        for (int i = 1 ; i < arr.length; i++){

            if (arr[i]<smallest){

                smallest= arr[1];
            }
        }
        System.out.println("Smallest:"+smallest);
    }
}
