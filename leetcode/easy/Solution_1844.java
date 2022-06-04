/**
 * author: seungw0n
 * question: Replace All Digits with Characters
 * details:
 *  Runtime: 2 ms, faster than 34.13% of Java online submissions for Replace All Digits with Characters.
 *  Memory Usage: 41.6 MB, less than 72.77% of Java online submissions for Replace All Digits with Characters.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    private char shift(char a, int i) {
        return (char)(a + i);
    }
    public String replaceDigits(String s) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i+=2) {
            char c = s.charAt(i);
            result.append(Character.toString(c));
            
            if (i+1 < s.length()) {
                int n = s.charAt(i+1) - '0';
                char shifted = shift(c, n);
                result.append(Character.toString(shifted));
            }
        }
        
        return result.toString();
    }
}
