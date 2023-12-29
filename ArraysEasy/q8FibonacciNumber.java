public class q8FibonacciNumber {

    //https://leetcode.com/problems/fibonacci-number/description/

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int number)
    {
        if( number == 0)
            return 0;
        if( number == 1)
            return 1;

        int[] arr = new int[number+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2 ; i <= number; i++)
        {
            arr[i] = arr[i-2] + arr[i-1];
        }

        return arr[number];
    }

}
