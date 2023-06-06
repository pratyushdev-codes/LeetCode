//Squares of a Sorted Array
//https://leetcode.com/problems/squares-of-a-sorted-array/
import java.util.Arrays;
public class SqaresofSortedarray {
    public static void main(String[] args) {
        int[] nums = {-11, 2, 4, 6, 8, 10, 11};
        int[] result = sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortedSquares(int[] arr) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * arr[i];
            }
            Arrays.sort(arr);  // Sort the array in non-decreasing order
            return arr;
        }
    }
}
