/**
 * author: seungw0n
 * question: Get Maximum in Generated Array
 * details:
 *  Runtime: 0 ms, faster than 100.00% of Java online submissions for Get Maximum in Generated Array.
 *  Memory Usage: 39.1 MB, less than 85.56% of Java online submissions for Get Maximum in Generated Array.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums = new int[n+1];
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        nums[0] = 0;
        nums[1] = 1;
        int max = 1;
        for (int i = 2; i < n+1; i++) {
            if (i % 2 == 0) {
                nums[i] = nums[i/2];
            } else {
                nums[i] = nums[i/2] + nums[i/2+1];
            }
            
            max = (max > nums[i])? max: nums[i];
        }
        
        
        return max;
    }
}

