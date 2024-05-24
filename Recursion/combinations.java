public class combinations {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;

        List<List<Integer>> ans = new ArrayList<>();
        ans = giveCombinations(n, k);

        for(int i = 0; i < ans.size(); i++)
        {
            System.out.println(ans.get(i).toString());
        }
    }

    private static List<List<Integer>> giveCombinations(int n, int k)
    {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> mySubset = new ArrayList<>();

        helper(1,n,k, mySubset, ans);

        return ans;
    }

    private static void helper(int i, int n, int k, List<Integer> subset, List<List<Integer>> ans)
    {
        //base condition 1 - if length of subset is k we have a valid subset
        if(k == 0)
        {
            ans.add(new ArrayList<>(subset));
            return;
        }
        //base condition 2 - if we have not more enough elements left
        if(k > n- i+1)
        {
            return;
        }
        //base condition 3 - if i passes over n
        if(i > n)
        {
            return;
        }


        //now we put in subset logic by decreasing k everytime we pick an element
        //pick the element

        subset.add(i);
        //call recursion
        helper(i+1, n, k-1, subset, ans);

        //backtrack
        subset.remove(subset.size()-1);

        //dont pick
        helper(i+1, n, k, subset, ans);

    }

}
