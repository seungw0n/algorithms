/**
 * author: seungw0n
 * question: Maximum Points You Can Obtain from Cards
 * details:
 *  Runtime: 2 ms, faster than 91.01% of Java online submissions for Maximum Points You Can Obtain from Cards.
 *  Memory Usage: 65.3 MB, less than 49.88% of Java online submissions for Maximum Points You Can Obtain from Cards.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxSum = 0;
        
        for (int i = 0; i < k; i++) {
            maxSum += cardPoints[i];
        }
        
        if (k == cardPoints.length) return maxSum;
        
        int right = cardPoints.length - 1;
        int end = k - 1;
        int current = maxSum;
        for (int i = 0; i < k; i++) {
            current = current - cardPoints[end] + cardPoints[right];
            right--;
            end--;
            maxSum = (current > maxSum)? current:maxSum;
        }
        
        return maxSum;
    }
}
