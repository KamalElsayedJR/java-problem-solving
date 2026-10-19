public class PalindromeNumber {
    static void main() {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        String reversed = new StringBuilder(num).reverse().toString();

        return num.equals(reversed);
    }
}
