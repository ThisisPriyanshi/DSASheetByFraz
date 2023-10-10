public class q6FindPivotIndex {

    //https://leetcode.com/problems/find-pivot-index/description/
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(findPivot(arr));
    }

    public static int findPivot(int[] nums)
    {
        int totSum = 0;
        int leftSum = 0;

        for(int ele : nums)
        {
            totSum += ele;
        }

        for(int i = 0; i < nums.length; i++)
        {
            if( (leftSum * 2) == totSum - nums[i]) {
                return nums[i];
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
