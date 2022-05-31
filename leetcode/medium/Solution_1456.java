/**
 * author: seungw0n
 * question: Maximum Number of Vowels in a Substring of Given Length
 * details:
 *  Runtime: 31 ms, faster than 25.78% of Java online submissions for Maximum Number of Vowels in a Substring of Given Length.
 *  Memory Usage: 48 MB, less than 39.06% of Java online submissions for Maximum Number of Vowels in a Substring of Given Length.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int max = 0;
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (vowels.contains(c)) count++;
            
            if (i+1 >= k) {
                max = Integer.max(count, max);
                if (vowels.contains(s.charAt(i+1-k))) count -= 1;
            }
        }
        
        return max;
    }
}
