/**
 * author: seungw0n
 * question: Container With Most Water
 * details:
 *  Runtime: 4 ms, faster than 71.72% of Java online submissions for Container With Most Water.
 *  Memory Usage: 81 MB less than 42.86% of Java online submissions for Container With Most Water.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    public int getMin(int a, int b) {
        if (a < b) return a;
        else return b;
    }
    
    
    public int maxArea(int[] height) {
        if (height.length == 2)
            return getMin(height[0], height[1]);
        
        else {
            int l = 0;
            int r = height.length-1;
            int max = 0;
            
            while (l < r) {
                int area = (r - l) * getMin(height[l], height[r]);
                
                if (max < area)
                    max = area;
                
                if (height[l] <= height[r])
                    l++;
                else
                    r--;
            }
            
            return max;
        }
        
    }
    
}
