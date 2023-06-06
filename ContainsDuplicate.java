import java.util.Arrays;

class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean result = containsDuplicate.containsDuplicate(arr);
        System.out.println(result);
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }
}
