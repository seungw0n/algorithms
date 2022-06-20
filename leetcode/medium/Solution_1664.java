/**
 * author: seungw0n
 * question: Ways to Make a Fair Array
 * details:
 *  Runtime: 13 ms, faster than 62.81% of Java online submissions for Ways to Make a Fair Array.
 *  Memory Usage: 89.7 MB, less than 47.52% of Java online submissions for Ways to Make a Fair Array.
 * comment:
 *  Need to change the filename (Solution.java)
*/



class Solution {
    public int waysToMakeFair(int[] nums) {
        if (nums.length == 1) return 1;
        if (nums.length == 2) return 0;
        
        int numFair = 0;
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        
        for (int i = 2; i < nums.length; i++) {
            if (i % 2 == 0) dp[i] = dp[i-2] + nums[i];
            else dp[i] = dp[i-2] + nums[i];
        }
        
        int indexEven = (nums.length % 2 == 0) ? nums.length-2 : nums.length-1;
        int indexOdd = (nums.length % 2 == 0) ? nums.length-1 : nums.length-2;
        
        // base case
        if (dp[indexEven] - dp[0] == dp[indexOdd]) numFair++;
        if (dp[indexOdd] - dp[1] + dp[0] == dp[indexEven] - dp[0]) numFair++;

        for (int i = 2; i < nums.length; i++) {
            int sum1 = 0, sum2 = 0;
            if (i % 2 == 0) {
                sum1 = dp[indexEven] - dp[i] + dp[i-1];
                sum2 = dp[indexOdd] - dp[i-1] + dp[i-2];
            } else {
                sum1 = dp[indexEven] - dp[i-1] + dp[i-2];
                sum2 = dp[indexOdd] - dp[i] + dp[i-1];
            }
            if (sum1 == sum2) numFair++;
        }
        
        return numFair;
    }
}
