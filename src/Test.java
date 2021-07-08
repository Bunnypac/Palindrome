public class Test {
    class Solution {
        public boolean isPalindrome(Integer x) {
            boolean isPalindrome = false;
            int reversed = 0;

            if (x < 0) {
                isPalindrome = false;
            }

            while (x > 0) {
                reversed = (reversed * 10) + (x % 10);
                x = x / 10;
            }
            if (x.equals(reversed)) {
                isPalindrome = true;
            }
            return isPalindrome;

        }
    }
}

