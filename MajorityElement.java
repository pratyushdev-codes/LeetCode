public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1, 1};
        MajorityElement majorityElement = new MajorityElement();
        int result = majorityElement.majorityElement(arr);
        System.out.println(result);
    }

    public int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;
        for (int num : nums) {
            int count = 0;
            for (int element : nums) {
                if (element == num) {
                    count++;
                }
            }
            if (count > majorityCount) {
                return num;
            }
        }
        return -1;
    }
}