public class q5PeakElement {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;


        while(start<end) {

            int mid = start + (end - start) /2;
            if (nums[mid] > nums[mid + 1]) //we are in decreasing part of array so look in the left side
            //mid element might be the answer
            {
                end = mid;
            } else { // we are in ascending part of the array
                start = mid + 1;
            }
        }

        return start;

    }
}
