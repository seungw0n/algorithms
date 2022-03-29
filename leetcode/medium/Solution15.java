/**
 * author: seungw0n
 * question: 3Sum
 * details:
 *  Runtime: 609 ms, faster than 15.69% of Java online submissions for 3Sum.
 *  Memory Usage: 145.1 MB less than 13.61% of Java online submissions for 3Sum.
 * comment:
 *  Need to change the filename (Solution.java)
*/


import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result;
        HashSet<List<Integer>> noDuplicates = new HashSet<>();
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length -1; i++) {
            int value = -1 * nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left != right) {
                int sum = nums[left] + nums[right];
                
                if (sum == value) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(-1 * value);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    noDuplicates.add(temp);
                    left++;
                } else if (sum > value) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        
        result = new ArrayList<>(noDuplicates);
        
        return result;
    }
}
