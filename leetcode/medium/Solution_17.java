/**
 * author: seungw0n
 * question: Letter Combinations of a Phone Number
 * details:
 *  Runtime: 5 ms, faster than 45.22% of Java online submissions for Letter Combinations of a Phone Number.
 *  Memory Usage: 41.4 MB, less than 79.28% of Java online submissions for Letter Combinations of a Phone Number.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    private ArrayList<String> result = new ArrayList<>();
    private char[][] letters = {
        {' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' '}, {'a', 'b', 'c', ' '},
        {'d', 'e', 'f', ' '}, {'g', 'h', 'i', ' '}, {'j', 'k', 'l', ' '},
        {'m', 'n', 'o', ' '}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v', ' '},
        {'w', 'x', 'y', 'z'}
    };
    
    private void combinations(String digits, int index, String s) {
        if (index == digits.length()) {
            result.add(s);
            return;
        }
        
        int digit = digits.charAt(index) - '0';
        
        for (int i = 0; i < 4; i++) {
            char letter = letters[digit][i];
            if (letter != ' ') {
                String tail = s + letter;
                combinations(digits, index+1, tail);
            }
        }
    }
    
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return result;
        combinations(digits, 0, "");
        return result;
        
    }
}
