class NumMatrix {

    private int[][] newMat;

    public NumMatrix(int[][] matrix) {
        int ROWS = matrix.length , COLS = matrix[0].length;
        newMat = new int [ROWS +1][COLS +1];

        for(int r = 0 ; r<ROWS  ; r++){
            int prefix = 0;
            for(int c = 0 ; c<COLS ; c++){
                prefix += matrix[r][c];
                int above = newMat[r][c+1];
                newMat[r+1][c+1] = prefix + above;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++ ; col1++ ; row2++ ; col2++;
        int bottomRight = newMat[row2][col2];
        int above = newMat[row1 - 1][col2];
        int left = newMat[row2][col1 - 1];
        int topLeft = newMat[row1 -1][col1 - 1];

        return bottomRight - above - left + topLeft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */