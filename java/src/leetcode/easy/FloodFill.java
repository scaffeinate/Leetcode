class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] != newColor) {
            floodFill(image, sr, sc, image[sr][sc], newColor);
        }
        return image;    
    }
    
    private void floodFill(int[][] image, int i, int j, int originalColor, int newColor) {
        if(i < 0 || i >= image.length || j < 0 || j >= image[i].length || image[i][j] != originalColor) {
            return;
        }
        image[i][j] = newColor;
        int[][] dirs = new int[][]{{0,-1},{0,1},{1,0},{-1,0}};
        for(int[] dir : dirs) {
            int x = i + dir[0], y = j + dir[1];
            floodFill(image, x, y, originalColor, newColor);
        }
    }
}
