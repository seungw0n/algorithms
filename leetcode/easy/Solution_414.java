
/**
 * author: seungw0n
 * question: Third Maximum Number
 * details:
 *  Runtime: 7 ms, faster than 35.18% of Java online submissions for Third Maximum Number.
 *  Memory Usage: 45.1 MB, less than 15.19% of Java online submissions for Third Maximum Number.
 * comment:
 *  Need to change the filename (Solution.java)
*/

import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        // try to set time complexity as O(n)
        HashSet<Integer> set = new HashSet<>();
        
        for (int i : nums) { // O(n)
            set.add(i);
        }
        
        int[] newNums = new int[set.size()];
        int index = 0;
        
        for (Integer i: set) { // O(n)
            newNums[index] = i;
            index++;
        }
        
        int maxIndex = 0;
        
        for (int i = 1; i < newNums.length; i++) { // O(n)
            maxIndex = (newNums[maxIndex] < newNums[i])? i : maxIndex;
        }
        
        if (newNums.length < 3) return newNums[maxIndex];
        
        newNums[maxIndex] = Integer.MIN_VALUE;
        int secondIndex = 0;
        for (int i = 1; i < newNums.length; i++) {
            secondIndex = (newNums[secondIndex] < newNums[i])? i : secondIndex;
        }
        
        newNums[secondIndex] = Integer.MIN_VALUE;
        int resultIndex = 0;
        for (int i = 1; i < newNums.length; i++) {
            resultIndex = (newNums[resultIndex] < newNums[i])? i : resultIndex;
        }
        
        return newNums[resultIndex];
        
    }
}
