/**
 * author: seungw0n
 * question: Base 7
 * details:
 *  Runtime: 1 ms, faster than 97.36% of Java online submissions for Base 7.
 *  Memory Usage: 41.1 MB, less than 66.36% of Java online submissions for Base 7.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        
        boolean isNegative = (num < 0)? true : false;
        
        if (isNegative) num *= -1;
        
        while (true) {
            
            if (num >= 7) {
                int mod = num % 7;
                sb.append(mod);
            } else {
                sb.append(num);
                break;
            }
            
            num = num / 7;
        }
        
        if (isNegative)
            sb.append("-");
        
        return sb.reverse().toString();
        
    }
}
