package Arrays;
//Find the largest element in an array.
public class largest {

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 80};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
    }
}
