/**
 * author: seungw0n
 * question: Reverse Integer
 * details:
 *  Runtime: 22 ms, faster than 5.19% of Java online submissions for Reverse Integer.
 *  Memory Usage: 42.6 MB
 * comment:
 *  Need to change the filename (Solution.java)
 *  Need to optimize 
*/

class Solution {
    public String reverseString(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++)
            result += str.charAt(str.length() - i - 1);
        return result;
    }
    
    public boolean compare(String a, String b) {
        if (a.equals(b)) return true;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > b.charAt(i)) return false;
            else if (a.charAt(i) < b.charAt(i)) return true;
        }
        
        return true;
    }
    
    public int reverse(int x) {
        String sign = "";
        if (x < 0) {
            sign = "-";
            x *= -1;
        }
        
        String str = Integer.toString(x);
        str = reverseString(str);
        
        
        if (str.length() > 10) return 0;
        else if (str.length() < 10) {
            str = sign + str;
            return Integer.parseInt(str);
        }
        else {
            int max = Integer.MAX_VALUE;
            boolean over = true;
            if (sign.equals("")) {
                String maxString = Integer.toString(max);
                over = compare(str, maxString);
            } else {
                String minString = Integer.toString(max - 1);
                over = compare(str, minString);
            }
            
            if (over) return Integer.parseInt(sign + str);
            else return 0;
        }

    }
}
