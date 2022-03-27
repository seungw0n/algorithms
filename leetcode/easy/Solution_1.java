/**
 * author: seungw0n
 * question: Two Sum
 * details:
 *  Runtime: 49ms, faster than 37.87% of Java submissions
 *  Memory Usage: 42.4 MB, less than 86.15% of Java submissions
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        
        return null;
    }
}
