public class q16subarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {

        int n = nums.length;
        int count = 0;
        int[] sum = new int[n+1];

        sum[0] = 0;

        for(int i = 1; i <= n; i++)
        {
            sum[i] = sum[i-1] + nums[i-1];
        }

        for(int start = 0; start < sum.length; start++)
        {
            for(int end = start+1; end < sum.length; end++)
            {
                if ((sum[end] - sum[start]) == k)
                {
                    count++;
                }

            }
        }

        return count;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subarraySum(arr,3));
    }
}

