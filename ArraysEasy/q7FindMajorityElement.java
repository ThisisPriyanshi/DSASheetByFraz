public class q7FindMajorityElement {
    //https://leetcode.com/problems/majority-element/description/

    //use boyer's moore algorithm
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(findMajorityElement(nums));
    }

    public static int findMajorityElement(int[] arr)
    {
        //Using Boyer Moore's algorithm
        int element = arr[0];
        int counter = 1;
        for(int i = 0; i < arr.length; i++)
        {
            if(counter == 0)
                element = arr[i];

            if(arr[i] == element)
                counter++;
            else
                counter --;

        }

        return element;
    }
}
