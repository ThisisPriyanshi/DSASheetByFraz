public class permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        boolean[] taken = new boolean[nums.length];
        findPermutations(nums, tempList, finalList, taken);
        System.out.println(finalList.toString());
    }

    private static void findPermutations(int[] nums, List<Integer> makePermutation, List<List<Integer>> allPermutations, boolean[] taken) {
        //base statement
        if (makePermutation.size() == nums.length)
        {
            allPermutations.add(new ArrayList<>(makePermutation));
            return;
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(!taken[i])
            {
                taken[i] = true;
                makePermutation.add(nums[i]);
                findPermutations(nums, makePermutation, allPermutations, taken);
                taken[i] = false;
                makePermutation.remove(makePermutation.size()-1);
            }
        }
    }
}
