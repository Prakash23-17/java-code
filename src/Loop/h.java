package Loop;

public class h {

        public static int findSmallest(int[] arr) {

            int smallest = arr[0];

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }

            return smallest;
        }

        public static void main(String[] args) {

            int[] arr = {10, 25, 7, 99, 45};

            System.out.println("Smallest = " + findSmallest(arr));
        }
}
