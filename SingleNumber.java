//https://leetcode.com/problems/single-number/


public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1};
        int result = singleNumber(arr);
        System.out.println(result);
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;//used XOR method to check the occurence
        }
        return result;
    }
}
