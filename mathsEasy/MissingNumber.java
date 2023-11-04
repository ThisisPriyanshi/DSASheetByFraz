public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int temp1=0,temp2=0;
        for(int i=0;i<nums.length;i++){
            temp1=temp1^nums[i];
            temp2=temp2^(i+1);
        }
        return temp1^temp2;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }
}
