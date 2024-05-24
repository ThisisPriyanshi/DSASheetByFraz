public class combinationSumII {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(candidates); //duplicate elements


        List<List<Integer>> ans = getCombinationSumII(candidates, target);

        for(int i = 0; i < ans.size(); i++)
        {
            System.out.println(ans.get(i).toString());
        }
    }

    private static List<List<Integer>> getCombinationSumII(int[] arr, int target)
    {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        int sumTillNow = 0;

        helper(0, arr, target, sumTillNow, subset, res);

        return res;
    }

    private static void helper(int index, int[] arr, int target, int sum, List<Integer>subset, List<List<Integer>> res)
    {
        //base condition
        if(sum == target)
        {
            res.add(new ArrayList<>(subset));
            return;
        }
        //base condition 2 -
        if(index >= arr.length)
        {
            return;
        }
        //base condition 3 -
        if(sum > target)
            return;

        //pick element
        sum += arr[index];
        subset.add(arr[index]);

        helper(index+1, arr, target, sum, subset, res);

        //backtrack
        sum -= arr[index];
        subset.remove(subset.size()-1);

        //ignore element but also ignore all duplicate existences
        while(index < arr.length - 1 && arr[index] == arr[index+1])
        {
            index++;
        }

        helper(index+1,arr, target,sum, subset, res );

        return;
    }
}
