public class permutations_ii {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        boolean[] taken = new boolean[nums.length];
        findPermutations(nums, tempList, finalList, taken);
        System.out.println(finalList.toString());
    }

    private static void findPermutations(int[] nums, List<Integer> tempList, List<List<Integer>> finalList, boolean[] taken)
    {
        //base statement
        if(tempList.size() == nums.length)
        {
            finalList.add(new ArrayList<>(tempList));
            return;
        }

        int lastRemoved = 99;
        for(int i = 0; i < nums.length; i++)
        {
            if(!taken[i] && nums[i] != lastRemoved)
            {
                taken[i] = true;
                tempList.add(nums[i]);
                findPermutations(nums, tempList,finalList, taken);
                taken[i] = false;
                lastRemoved = tempList.remove(tempList.size() - 1);
            }
        }
    }
}
