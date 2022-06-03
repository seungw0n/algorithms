/**
 * author: seungw0n
 * question: Minimum Value to Get Positive Step by Step Sum
 * details:
 *  Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Value to Get Positive Step by Step Sum.
 *  Memory Usage: 41.3 MB, less than 65.80% of Java online submissions for Minimum Value to Get Positive Step by Step Sum.
 * comment:
 *  Need to change the filename (Solution.java)
*/


class Solution {
    public int minStartValue(int[] nums) {
        int startVal = 1;
        
        int prefix = nums[0];
        int minimum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix = prefix + nums[i];
            minimum = (prefix < minimum)? prefix : minimum;
        }
        
        if (minimum >= 0) return 1;
        else return -1 * minimum + 1;

    }
}
