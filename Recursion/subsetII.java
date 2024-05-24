public class subsetIIRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = new ArrayList<>();
        ans = getSubsetsWithDuplicates(arr);

        for(int i = 0; i < ans.size(); i++)
        {
            System.out.println(ans.get(i).toString());
        }
    }

    private static List<List<Integer>> getSubsetsWithDuplicates(int[] arr)
    {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        Arrays.sort(arr);

        helper(0, arr, subset, result);
        return result;
    }

    private static void helper(int i, int[] arr, List<Integer> sub, List<List<Integer>> ans)
    {
        //base condition
        if(i == arr.length)
        {
            ans.add(new ArrayList<>(sub));
            return;
        }

        //pick up element
        sub.add(arr[i]);
        //call recursion
        helper(i+1, arr, sub, ans);

        //backtrack
        sub.remove(sub.size()-1);

        //now we will skip all duplicates also
        while(i < arr.length-1 && arr[i] == arr[i+1])
        {
            i++;
        }

        //call recurion
        helper(i+1, arr, sub, ans);
        return;
    }
}
