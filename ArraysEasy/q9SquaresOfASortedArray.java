import java.util.Arrays;

public class q9SquaresOfASortedArray {
    //https://leetcode.com/problems/squares-of-a-sorted-array/description/

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    public static int[] sortedSquares(int[] nums)
    {
        int leftIndex = 0;
        int rightIndex = nums.length -1;
        int index = nums.length-1;

        int[] result = new int[nums.length];

        while(leftIndex <= rightIndex) {
            if ((Math.abs(nums[leftIndex])) > Math.abs(nums[rightIndex]))
            {
                result[index] = nums[leftIndex] * nums[leftIndex];
                leftIndex++;
            }
            else
            {
                result[index] = nums[rightIndex] * nums[rightIndex];
                rightIndex--;
            }

            index--;
        }

        return result;
    }
}
