/**
 * author: seungw0n
 * question: Find the Student that Will Replace the Chalk
 * details:
 *  Runtime: 2 ms, faster than 78.96% of Java online submissions for Find the Student that Will Replace the Chalk.
 *  Memory Usage: 78.3 MB, less than 58.56% of Java online submissions for Find the Student that Will Replace the Chalk.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    private int getStudent(int[] chalk, int k) {
        for (int i = 0; i < chalk.length; i++) {
            k -= chalk[i];
            if (k < 0) return i;
        }
        
        return -1;
    }
    
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for (int c: chalk) sum+=c;
        
        if (k < sum) {
            return getStudent(chalk, k);
        }
        
        if (k % sum == 0) return 0;
        
        k = k % Long.valueOf(sum).intValue();
        return getStudent(chalk, k);
    }
}
