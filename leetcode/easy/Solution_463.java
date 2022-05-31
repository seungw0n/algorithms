/**
 * author: seungw0n
 * question: Island Perimeter
 * details:
 *  Runtime: 14 ms, faster than 23.13% of Java online submissions for Island Perimeter.
 *  Memory Usage: 62.4 MB, less than 40.37% of Java online submissions for Island Perimeter.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class Solution {
    private int[] m = {1, 0, -1, 0};
    private int[] n = {0, -1, 0, 1};
    private int perimeter = 0;
    
    private void find(int i, int j, int[][] grid) {
        for (int k = 0; k < 4; k++) {
            int newI = i + m[k];
            int newJ = j + n[k];
            
            if (newI < 0 || newI >= grid.length || newJ < 0 || newJ >= grid[0].length) {
                continue;
            }
            
            int pos = grid[newI][newJ];
            if (pos == 1) perimeter--;
        }
    }
    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int pos = grid[i][j];
                if (pos == 1) {
                    this.perimeter += 4;
                    find(i, j, grid);
                }
            }
        }
        
        return this.perimeter;
    }
    
}
