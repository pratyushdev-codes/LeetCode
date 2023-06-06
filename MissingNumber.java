import java.util.stream.IntStream;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = n * (n + 1) / 2;
        int arraySum = IntStream.of(nums).sum();
        return actualSum - arraySum;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3}; // Add the desired array elements here
        MissingNumber solution = new MissingNumber();
        int missingNumber = solution.missingNumber(arr);
        System.out.println("Missing number: " + missingNumber);
    }
}
