
/**
 * author: seungw0n
 * question: Generate Parentheses
 * details:
 *  Runtime: 3 ms, faster than 37.85% of Java online submissions for Generate Parentheses.
 *  Memory Usage: 44.1 MB, less than 28.73% of Java online submissions for Generate Parentheses.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    private List<String> list = new ArrayList<String>();
    private int n;
    
    private void recursive(int open, int close, String parenthesis) {
        if (open == n && close == n) {
            list.add(parenthesis);
            return;
        }
        if (open < n) {
            recursive(open + 1, close, parenthesis + "(");
        }
        if (open > close) {
            recursive(open, close + 1, parenthesis + ")");
        }
    }
    public List<String> generateParenthesis(int n) {
        if (n == 1) list.add("()");
        else {
            this.n = n;
            recursive(1, 0, "(");
        }
        return list;
    }
}
