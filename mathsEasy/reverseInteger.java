public class reverseInteger {
    public static int reverse(int x) {
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum = finalNum* 10 + lastDig;
            x = x/10;
        }
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
    }

    public static void main(String[] args) {
        int num = 123;
        num = reverse(num);
        System.out.println(num);
    }
}
