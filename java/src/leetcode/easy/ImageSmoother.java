class ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
        if(M.length == 0) return M;
        int[][] neighbours = new int[][] { {0,1}, {0,-1},{1,0}, {-1,0}, {-1,-1}, {1,1}, {1,-1}, {-1,1} };
        int[][] result = new int[M.length][M[0].length];
        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[i].length; j++) {
                double sum = M[i][j]; int count = 1;
                for(int[] neighbour : neighbours) {
                    int x = i + neighbour[0], y = j + neighbour[1];
                    if(withinBounds(x,y,M)) {
                        sum += M[x][y]; count++;
                    }
                }
                result[i][j] = (int) (sum/count);
            }
        }
        
        return result;
    }
    
    private boolean withinBounds(int i, int j, int[][] M) {
        return (i >= 0 && i < M.length) && (j >= 0 && j < M[i].length); 
    }
}
