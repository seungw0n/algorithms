/**
 * author: seungw0n
 * question: Longest Substring Without Repeating Characters
 * details:
 *  Runtime: 16 ms, faster than 32.16% of Java online submissions for Longest Substring Without Repeating Characters.
 *  Memory Usage: 48.2 MB, less than 16.72% of Java online submissions for Longest Substring Without Repeating Characters.
 * comment:
 *  Need to change the filename (Solution.java)
*/

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue = new LinkedList<Character>();
        HashSet<Character> set = new HashSet<>();
        
        int max = 0;
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (queue.peek() == null) {
                queue.add(c);
                set.add(c);
                count++;
                max = Integer.max(max, count);
                continue;
            }
            
            if (set.contains(c)) {
                max = Integer.max(max, count);
                
                while(set.contains(c)) {
                    char removed = queue.poll();
                    set.remove(removed);
                    count--;
                }
            } 
            
            queue.add(c);
            set.add(c);
            count++;
            max = Integer.max(max, count);

            
        }
        
        return max;
    }
}
