package Loop;

import java.util.Stack;
import java.util.Arrays;

public class l {

        public static void main(String[] args) {

            int[] arr = {10, 20, 30, 40};

            Stack<Integer> stack = new Stack<>();

            // Put all array elements into stack
            for (int num : arr) {
                stack.push(num);
            }

            // Pop elements and put them back into array
            for (int i = 0; i < arr.length; i++) {
                arr[i] = stack.pop();
            }

            System.out.println(Arrays.toString(arr));
        }


}
