/**
 * author: seungw0n
 * question: Closest Dessert Cost
 * details:
 *  Runtime: 166 ms, faster than 8.04% of Java online submissions for Closest Dessert Cost.
 *  Memory Usage: 41.8 MB, less than 36.38% of Java online submissions for Closest Dessert Cost.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        int finalCost = baseCosts[0];
        int[] bitmask;
        
        for (int i = 0; i < baseCosts.length; i++) {
            bitmask = new int[toppingCosts.length];
            
            while (true) {
                int cost = baseCosts[i];
                
                for (int j = 0; j < bitmask.length; j++) {
                    cost += bitmask[j] * toppingCosts[j];
                }
                
                if (cost - target == 0) return cost;
                else if (Math.abs(cost - target) < Math.abs(finalCost - target))
                    finalCost = cost;
                else if (Math.abs(cost - target) == Math.abs(finalCost - target)) {
                    if (cost < finalCost) finalCost = cost;
                }
                
                boolean flagZero = false;
                boolean flagOne = false;
                for (int j = 0; j < bitmask.length; j++) {
                    if (bitmask[j] == 0) flagZero = true;
                    if (bitmask[j] == 1) flagOne = true;
                }
                
                if (!flagZero && !flagOne) break; // All elements are 2
                
                for (int j = 0; j < bitmask.length; j++) {
                    if (bitmask[j] != 2) { // at most two of each type of topping
                        bitmask[j] += 1;
                        break;
                    } else { // In case of, 2
                        bitmask[j] = 0;
                    }
                }
            }
        }
        
        return finalCost;
        
    }
}
