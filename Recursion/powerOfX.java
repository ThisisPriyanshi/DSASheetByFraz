public class powerofX {
    public static void main(String[] args) {
        System.out.println(myPow(8,-2));
    }

    public static double myPow(double x, int n) {

        //base statement
        if(n == 0)
            return 1;

        //if powers are in negative
        if( n < 0)
        {
            x = 1/x;
            n = Math.abs(n);

            double res = x * myPow(x, n-1);
            return res;
        }

        //if powers are positive
        else {
            double res = x * myPow(x, n - 1);
            return res;
        }
    }
}
