public class q11RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {12,13,17,18,18,20,45,78};
        System.out.println("Number of UNIQUE elements " + removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i + 1;
        }
}
