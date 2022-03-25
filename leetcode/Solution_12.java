/*
  author: seungw0n
  description: question 12 - first trial
  details:
    Runtime: 12ms, faster than 39.24% of Java submissions
    Memory Usage: 48.1 MB, less than 13.72% of Java submissions
  comment:
    Need to optimize the algorithm for this question.
    Need to change the filename (Solution.java)
*/

import java.util.ArrayList;

class Solution {
    
    public int find(int num) {
        int[] specialValues = {4, 9, 40, 90, 400, 900};
        
        for (int i = 0; i < specialValues.length; i++) {
            if (num == specialValues[i])
                return i;
        }
        return -1;
    }
    
    public String buildRoman(int num) {
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        String[] symbols = {"I", "V", "X", "L", "C", "D", "M"};
        
        String str = "";
        int i = 6;
        
        while (num != 0) {
            if (num - values[i] >= 0) {
                num -= values[i];
                str += symbols[i];
            }
            else i--;
        }
        
        return str;
    }
    
    public String intToRoman(int num) {
        String[] specialSymbols = {"IV", "IX", "XL", "XC", "CD", "CM"};
        
        ArrayList<String> lst = new ArrayList<String>();
        
        int div = 10;
        while (num != 0) {
            int mod = num % div;
            int index = find(mod);
            
            if (index >= 0 ) lst.add(specialSymbols[index]);
            else lst.add(buildRoman(mod));
            
            num = num - mod;
            div = div * 10;
        }
        
        String res = "";
        for (int i = lst.size() - 1; i >= 0; i--) {
            res += lst.get(i);
        }
        
        return res;
        
    }
}
