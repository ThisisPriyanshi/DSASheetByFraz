import java.util.Arrays;

public class q4MoveZeroesArrays {
    //https://leetcode.com/problems/move-zeroes/description/

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
    public static int[] moveZeroes(int[] arr)
    {
        int i = 0;
        for(int ele : arr)
        {
            if(ele != 0)
            {
                arr[i] = ele;
                i++;
            }
        }

        while( i <= (arr.length - 1))
        {
            arr[i] = 0;
            i++;
        }

        return arr;
    }
}
