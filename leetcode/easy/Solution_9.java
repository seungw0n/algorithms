/**
 * author: seungw0n
 * question: Palindrome Number
 * details:
 *  Runtime: 19 ms, faster than 21.03% of Java online submissions for Palindrome Number.
 *  Memory Usage: 44.4 MB, less than 61.46% of Java online submissions for Palindrome Number.
 * comment:
 *  Need to change the filename (Solution.java)
 *  Need to optimize 
*/

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else if (x == 0) return true;
        else {
            int temp = x;
            int reversed = 0;
            while (temp > 0) {
                int remainder = temp % 10;
                
                reversed = (reversed * 10) + (remainder);
                temp -= remainder;
                temp /= 10;
            }
            
            if (x == reversed) return true;
            else return false;
        }
    }
}
