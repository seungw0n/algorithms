/**
 * author: seungw0n
 * question: Check If a String Contains All Binary Codes of Size K
 * details:
 *  Runtime: 259 ms, faster than 23.96% of Java online submissions for Check If a String Contains All Binary Codes of Size K.
 *  Memory Usage: 116.2 MB, less than 35.94% of Java online submissions for Check If a String Contains All Binary Codes of Size K.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    public boolean hasAllCodes(String s, int k) {
        if (k >= 19) return false;
        
        HashSet<String> set = new HashSet<>();
        int count = (int)Math.pow(2, k);

        for (int i = 0; i < s.length()-k+1; i++) {
            String temp = s.substring(i, i + k);
            set.add(temp);
        }
        
        
        if (set.size() >= count) return true;
        else return false;
        
    }
}
