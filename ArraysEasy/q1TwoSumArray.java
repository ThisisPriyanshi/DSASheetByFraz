import java.util.*;

public class q1TwoSumArray {
    //https://leetcode.com/problems/two-sum/description/
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};

        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me what number");
        int find = sc.nextInt();
        int[] result = findTwoSum(nums,find );
        System.out.println(Arrays.toString(result));
    }

    public static int[] findTwoSum(int[] arr, int target)
    {
        int sum = 0;
        int[] result = new int[2];
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if ((arr[i] + arr[j]) == target)
                {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
