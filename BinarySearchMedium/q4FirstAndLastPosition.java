public class q4FirstAndLastPosition {

    public int[] searchRange(int[] nums, int target) {

        boolean firstoccurence = true;

        int ans[] = {-1, -1};

        //look for first occurence first
        ans[0] = searchIndex(nums, target, firstoccurence);
        if(ans[0] != -1)
        {
            firstoccurence = false;
            ans[1] = searchIndex(nums,target, firstoccurence);
        }
        return ans;

    }

    public int searchIndex(int[] nums, int target, boolean firstoccurence)
    {
        int start = 0;
        int end = nums.length - 1;
        int[] ans = {-1, -1};
        int posans = -1;

        while(start<=end)
        {
            int mid = start + (end - start)/2 ;

            if (target < nums[mid])
            {
                end = mid -1;
            }
            else if (target> nums[mid])
            {
                start = mid+1;
            }
            else
            {
                posans = mid;
                if (firstoccurence)
                {
                    end = mid -1;
                }
                else
                {
                    start = mid+1;
                }
            }
        }

        return posans;
    }

}
