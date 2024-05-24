public class combinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = getCombinationSum(candidates, target);

        for(int i = 0; i < ans.size(); i++)
        {
            System.out.println(ans.get(i).toString());
        }

    }

    private static List<List<Integer>> getCombinationSum(int[] arr, int target)
    {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        int sumTillNow = 0;

        helper(0, arr, target, sumTillNow, subset, res);
        return res;
    }

    private static void helper(int index, int[] arr, int target, int sum, List<Integer> subset, List<List<Integer>> result)
    {
        //base condition
        if(sum == target)
        {
            result.add(new ArrayList<>(subset));
            return;
        }

        //if index exceeds length of array
        if(index == arr.length)
        {
            return;
        }

        //if sum exceeds target
        if( sum > target)
        {
            return;
        }

        //skip the element
        helper(index+1, arr, target, sum, subset, result);

        //pick the element
        sum += arr[index];
        subset.add(arr[index]);

        //we will call helper, but we have the option of choosing an element multiple times so we will not increase the index
        helper(index,arr, target,sum, subset, result);

        //backtrack
        sum -= arr[index];
        subset.remove(subset.size()-1);
        return;

    }
}
