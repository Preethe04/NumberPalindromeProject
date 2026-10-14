public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) return false;
        int original = number;
        long reversed = 0;
        do {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        } while (number != 0);
        return original == reversed;
    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println(number + (isPalindrome(number) ? " is a Palindrome" : " is not a Palindrome"));
    }
}
