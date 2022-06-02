/**
 * author: seungw0n
 * question: Three Consecutive Odds
 * details:
 *  Runtime: 0 ms, faster than 100.00% of Java online submissions for Three Consecutive Odds.
 *  Memory Usage: 43 MB, less than 36.61% of Java online submissions for Three Consecutive Odds.
 * comment:
 *  Need to change the filename (Solution.java)
*/


class Solution {
    private boolean isOdd(int n) { return n % 2 == 1; }
    public boolean threeConsecutiveOdds(int[] arr) {
        
        for (int i = 0; i < arr.length - 2; i++) {
            if (isOdd(arr[i]) && isOdd(arr[i+1]) && isOdd(arr[i+2])) return true;
        }
        
        return false;
            
    }
}
