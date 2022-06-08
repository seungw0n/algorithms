/**
 * author: seungw0n
 * question: Remove Colored Pieces if Both Neighbors are the Same Color
 * details:
 *  Runtime: 22 ms, faster than 51.03% of Java online submissions for Remove Colored Pieces if Both Neighbors are the Same Color.
 *  Memory Usage: 53.7 MB, less than 69.18% of Java online submissions for Remove Colored Pieces if Both Neighbors are the Same Color.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    public boolean winnerOfGame(String colors) {
        // For Alice, there's no way to win if length of given string <= 2.
        if (colors.length() <= 2) return false;
        int a = 0;
        int b = 0;
        
        for (int i = 1; i < colors.length() - 1; i++) {
            char prev = colors.charAt(i-1);
            char curr = colors.charAt(i);
            char next = colors.charAt(i+1);
            
            if (prev == curr && curr == next) {
                if (prev == 'A') a++;
                else b++;
            }
        }
        
        return a > b;
        
    }
}
