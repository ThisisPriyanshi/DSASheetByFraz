import java.util.Arrays;

public class q14prodExceptSelf {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));

    }
    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = 1;
        suffix[n-1] = 1;

        for(int p = 1; p<n ; p++)
        {
            prefix[p] = prefix[p-1] * nums[p-1];
        }

        for(int s = n-2; s >= 0; s--)
        {
            suffix[s] = suffix[s+1] * nums[s+1];
        }

        int[] ans = new int[n];
        for(int a = 0; a<n; a++)
        {
            ans[a] = prefix[a] * suffix[a];
        }
        return ans;
    }

}
