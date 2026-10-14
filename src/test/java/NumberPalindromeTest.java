import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberPalindromeTest {
    @Test void palindromeNumber() { assertTrue(NumberPalindrome.isPalindrome(121)); }
    @Test void nonPalindromeNumber() { assertFalse(NumberPalindrome.isPalindrome(123)); }
    @Test void singleDigit() { assertTrue(NumberPalindrome.isPalindrome(7)); }
    @Test void zero() { assertTrue(NumberPalindrome.isPalindrome(0)); }
    @Test void negativeNumber() { assertFalse(NumberPalindrome.isPalindrome(-121)); }
    @Test void trailingZero() { assertFalse(NumberPalindrome.isPalindrome(120)); }
}
