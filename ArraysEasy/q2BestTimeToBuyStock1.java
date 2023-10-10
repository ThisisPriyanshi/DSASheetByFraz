public class q2BestTimeToBuyStock1 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

        int[] arr = {7,1,5,3,6,4};
        System.out.println("Maximum profit = "+ findMaxProfit(arr));
        int[] arr2 = {7,6,4,3,1};
        System.out.println("Maximum profit = "+ findMaxProfit(arr2));

    }

    public static int findMaxProfit(int[] arr)
    {
        int length = arr.length;
        int maxProfit = 0;
        int min = arr[0];
        int finalProfit = 0;

        for(int i = 0; i<length; i++)
        {
            if ( arr[i] < min)
                min = arr[i];

            maxProfit = arr[i] -min;
            finalProfit = Math.max(maxProfit, finalProfit);
        }

        return finalProfit;
    }
}
