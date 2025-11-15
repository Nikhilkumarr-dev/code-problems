import java.util.*;
public class problem33{
    static int rows, cols;
    static boolean[][] visited;

    static void dfs(int[][] grid, int r, int c) {
        // 1. boundary check
        if (r < 0 || c < 0 || r >= rows || c >= cols) return;

        // 2. already visited or it's 0 (we don't care)
        if (visited[r][c] || grid[r][c] == 0) return;

        // 3. mark visited
        visited[r][c] = true;//-->(0,0),
        System.out.println("Visited: (" + r + "," + c + ")");

        // 4. visit 4 directions
        dfs(grid, r + 1, c); // down --> grid,1,0
        dfs(grid, r - 1, c); // up
        dfs(grid, r, c + 1); // right
        dfs(grid, r, c - 1); // left
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0},
                {0, 1, 1},
                {0, 0, 1}
        };

        rows = grid.length;
        cols = grid[0].length;
        visited = new boolean[rows][cols];

        dfs(grid, 0, 0); // start from top-left (0,0)
    }
}
