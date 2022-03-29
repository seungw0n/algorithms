/**
 * author: seungw0n
 * question: 3Sum Closet
 * details:
 *  Runtime: 9 ms, faster than 69.85% of Java online submissions for 3Sum Closest.
 *  Memory Usage: 43.9 MB, less than 6.73% of Java online submissions for 3Sum Closest.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int closet = nums[0] + nums[1] + nums[nums.length - 1];
        
        for (int i = 0; i < nums.length - 1; i++) {
            int fixed = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left != right) {
                int sum = fixed + nums[left] + nums[right];

                if (target == sum) {
                    closet = sum;
                    break;
                }
                
                if (Math.abs(target - sum) < Math.abs(target - closet)) {
                    closet = sum;
                }
                
                if (target > sum)
                    left++;
                else
                    right--;

            }
            
            if (closet == target) break;
        }
        
        return closet;
    }
}
