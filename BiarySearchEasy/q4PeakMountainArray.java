public class q4PeakMountainArray {
    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;


        while(start<end) {

            int mid = start + (end - start) /2;
            if (arr[mid] > arr[mid + 1]) //we are in decreasing part of array so look in the left side
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
