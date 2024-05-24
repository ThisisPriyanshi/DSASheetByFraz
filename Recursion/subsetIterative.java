public class subsets {
    public static List<List<Integer>> findSubsets(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> myList = new ArrayList<>();
        myList.add(new ArrayList<>());

        for(int num : nums)
        {
            int n = myList.size();
            for(int i = 0; i < n; i++)
            {
                List<Integer> mySubList = new ArrayList<>(myList.get(i));
                mySubList.add(num);
                myList.add(mySubList);
            }
        }

        return myList;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2};
        List<List<Integer>> myAns = findSubsets(arr);
        System.out.println(myAns.toString());
    }
}
