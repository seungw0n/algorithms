/**
 * author: seungw0n
 * question: The kth Factor of n
 * details:
 *  Runtime: 3 ms, faster than 13.27% of Java online submissions for The kth Factor of n.
 *  Memory Usage: 41.7 MB, less than 12.87% of Java online submissions for The kth Factor of n.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    private int[] factors;
    
    public int kthFactor(int n, int k) {
        factors = new int[n+1];
        int count = 2;
        factors[1] = 1;
        factors[n] = 1;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                factors[i] = 1;
                count++;
            }
        }
        
        if (count < k) return -1;
        
        int result = -1;
        for (int i = 1; i <= n; i++) {
            if (factors[i] == 1) {
                k -= 1;
            }
            
            if (k == 0) {
                result = i;
                break;
            }
        }
        
        return result;
    }
}
