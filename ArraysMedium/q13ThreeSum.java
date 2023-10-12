import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q13ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        //int[] arr1 = {0,1,1};
        //int[] arr2 = {0,0,0};

        List<List<Integer>> ans = ThreeSum(arr);
        for (List<Integer> myArr : ans) {
            System.out.print("[");
            for (Integer i : myArr) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();

    }

    static List<List<Integer>> ThreeSum (int[] nums)
    {
        List<List<Integer>> myList = new ArrayList<>();
        int n = nums.length;
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++)
        {
            //skip duplicates for i
            if(i>0 && (nums[i] == nums[i-1]))
            {
                continue;
            }
            //setting j and k for every change of i
            int j = i+1;
            int k = n-1;

            while(j<k)
            {
                sum = nums[i] + nums[j] + nums[k];

                if(sum < 0)
                {
                    j++;
                }
                else if( sum > 0)
                {
                    k--;
                }
                else
                {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    myList.add(temp);
                    j++;
                    k--;
                }

                //skip duplicates for j,k

                while( j<k && (nums[j] == nums[j+1]))
                {
                    j++;
                }
                while( k>j && (nums[k] == nums[k-1]))
                {
                    k--;
                }
            }
        }

        return myList;
    }
}
