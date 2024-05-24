public class validPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama ";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String s) {

        //convert the string to only letters and lowercase

        s = s.replaceAll("[^A-Za-z0-9]", "");
        s = s.toLowerCase();

        System.out.println(s);

        return palindromeHelper(s,0, s.length()-1);

    }
    private static boolean palindromeHelper(String str, int start, int end)
    {
        if( start >= end)
        {
            return true;
        }

        if(str.charAt(start) != str.charAt(end))
            return false;

        return palindromeHelper(str, start+1, end-1);
    }
}
