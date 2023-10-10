import java.util.Arrays;

public class q3plusOne {
    public static void main(String[] args) {

        //https://leetcode.com/problems/plus-one/description/
        int[] arr ={9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] num)
    {
        for(int i = (num.length - 1); i > 0; i--)
        {
            if (num[i] < 9)
            {
                num[i]++;
                return num;
            }

            num[i] = 0;
        }

        int[] result = new int[num.length + 1];
        result[0] = 1;
        return result;
    }

}
