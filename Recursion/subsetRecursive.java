public class subsetsRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,4};
        List<List<Integer>> ans = new ArrayList<>();
        ans = giveSubsets(arr);

        for(int i = 0; i < ans.size(); i++)
        {
            System.out.println(ans.get(i).toString());
        }
    }
    private static List<List<Integer>> giveSubsets(int[] arr)
    {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> mysubset = new ArrayList<>();

        helper(0, arr, mysubset, result);
        return result;
    }

    private static void helper(int i, int[] arr, List<Integer> subset, List<List<Integer>> result)
    {
        //base condition
        if(i == arr.length)
        {
            result.add(new ArrayList<>(subset));
            return;
        }

        //pick up element
        subset.add(arr[i]);
        helper(i+1, arr, subset, result);

        //backtrack
        subset.remove(subset.size()-1);

        //dont pick
        helper(i+1, arr, subset, result);
        return;
    }



}
