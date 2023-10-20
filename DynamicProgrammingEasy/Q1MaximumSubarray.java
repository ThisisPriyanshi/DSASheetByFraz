public class Q1MaximumSubArray {
    public int maxSubArray(int[] nums) {
        //usimg kadane's algorithm'
        int length = nums.length;
        int maxSum = nums[0];
        int sum = 0;

        for(int i = 0; i< length; i++)
        {
            sum = sum + nums[i]; //step 1 - update sum

            maxSum = Math.max(sum, maxSum); // step 2 - set maxSum value

            if(sum < 0)
            {
                sum = 0; //step 3 - check if sum < 0 if yes then set it to 0
            }


        }

        return maxSum;
    }
}
