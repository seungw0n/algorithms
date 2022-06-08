/**
 * author: seungw0n
 * question: Find Unique Binary String
 * details:
 *  Runtime: 2 ms, faster than 73.79% of Java online submissions for Find Unique Binary String.
 *  Memory Usage: 42.1 MB, less than 58.66% of Java online submissions for Find Unique Binary String.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    private String ans = "";
    private String[] nums;
    
    private boolean contains(String[] arr, String s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s)) return true;
        }
        
        return false;
    }
    
    private void buildBinary(int n, String binary) {
        if (n == 0) {
            if (!contains(nums, binary))
                ans = binary;
            return;
        }
        
        if (!ans.equals("")) return;
        
        buildBinary(n-1, binary + "0");
        buildBinary(n-1, binary + "1");
    }
    
    public String findDifferentBinaryString(String[] nums) {
        this.nums = nums;
        buildBinary(nums.length, "");
        return ans;
    }
}
