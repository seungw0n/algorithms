
/**
 * author: seungw0n
 * question: Rings and Rods
 * details:
 *  Runtime: 1 ms, faster than 73.95% of Java online submissions for Rings and Rods.
 *  Memory Usage: 41.6 MB, less than 65.45% of Java online submissions for Rings and Rods.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Rod {
    int number;
    boolean red;
    boolean green;
    boolean blue;
    
    public Rod(int number) {
        this.number = number;
        red = false;
        green = false;
        blue = false;
    }
    
    public boolean isAll() {
        return red && green && blue;
    }
}

class Solution {
    public int countPoints(String rings) {
        Rod[] rods = new Rod[10];
        
        for (int i = 0; i < 10; i++) {
            rods[i] = new Rod(i);
        }
        
        for (int i = 0; i < rings.length()-1; i+=2) {
            int number = rings.charAt(i+1) - '0';
            char color = rings.charAt(i);
            
            if (color == 'R') rods[number].red = true;
            else if (color == 'B') rods[number].blue = true;
            else rods[number].green = true;
        }
        
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if(rods[i].isAll()) result++;
        }
        
        return result;
    }
}
