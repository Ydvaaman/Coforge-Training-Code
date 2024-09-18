import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    StringPalindrome palindrome;

    @Test
    void testpalindrome(){
        Assertions.assertEquals(palindrome.isPalindrome("racecar"),true);
    }
}
