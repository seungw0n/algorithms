/**
 * author: seungw0n
 * question: Letter Combinations of a Phone Number
 * details:
 *  Runtime: 10 ms, faster than 13.00% of Java online submissions for Letter Combinations of a Phone Number.
 *  Memory Usage: 43.1 MB, less than 29.39% of Java online submissions for Letter Combinations of a Phone Number.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    private char[][] numbers = {{' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' '}, {'a', 'b', 'c', ' '}, {'d','e','f', ' '}, {'g','h','i', ' '}, {'j','k','l',' '}, {'m','n','o', ' '}, {'p','q','r','s'}, {'t','u','v', ' '}, {'w','x','y','z'}};
    private List<String> list;
    private boolean[] visited;
    
    private void dfs(String digits, String tail) {
        if (digits.length() == 0) {
            list.add(tail);
            return;
        }
        
        char c = digits.charAt(0);
        
        for (int i = 0; i < 4; i++) {
            if (numbers[c - '0'][i] == ' ') break;
            String temp = tail + numbers[c - '0'][i];
            
            if (digits.length() > 1) {
                dfs(digits.substring(1), temp);
            } else {
                dfs("", temp);
            }
            
        }
    }
    
    public List<String> letterCombinations(String digits) {
        list = new ArrayList<>();
        if (digits.length() == 0) return list;
        dfs(digits, "");
        return list;
    }
}
