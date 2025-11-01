public class problem25 {
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0]; //-2
        int maxSum = nums[0];//-2

        for (int i = 1; i < nums.length; i++) {
            // Step 1: Either start a new subarray or continue the current one
            currentSum = Math.max(nums[i], currentSum + nums[i]);//1 //-2 //4 //3 //4 //-1 //4

            // Step 2: Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum); //1 //1   //4 //4 //4 //4 //4
        }
        return maxSum;
    }
    public static int maxSubArray1(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum = " + result);
        int result1=maxSubArray1(nums);
        System.out.println(result1);
    }
}