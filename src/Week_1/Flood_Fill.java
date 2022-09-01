package Week_1;

import java.util.Arrays;

public class Flood_Fill {
    public static void main(String[] args){
        int[][] image = {
                {1,1,1}
                ,{1,1,0}
                ,{1,0,1}
        };
        int sr = 1, sc = 1, color =2;
        System.out.println(Arrays.deepToString(floodFill(image, sr, sc, color)));
    }

    private static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // get initial color
        int iniColor = image[sr][sc];
        int[][] ans = image;
        // delta row and delta column for neighbours
        int delRow[] = {-1, 0, +1, 0};
        int delCol[] = {0, +1, 0, -1};
        dfs(sr, sc, ans, image, newColor, delRow, delCol, iniColor);
        return ans;
    }

    private static void dfs(int row, int col, int[][] ans, int[][] image, int newColor, int[] delRow, int[] delCol, int iniColor) {
        // color with new color
        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;
        // there are exactly 4 neighbours
        for(int i = 0;i<4;i++) {
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];
            // check for valid coordinate
            // then check for same initial color and unvisited pixel
            if(nrow>=0 && nrow<n && ncol>=0 && ncol < m &&
                    image[nrow][ncol] == iniColor && ans[nrow][ncol] != newColor) {
                dfs(nrow, ncol, ans, image, newColor, delRow, delCol, iniColor);
            }
        }
    }
}
