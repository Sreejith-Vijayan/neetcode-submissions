class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totRows = matrix.length, totCol = matrix[0].length;

        int top = 0;
        int bottom = totRows - 1;

        while( top <= bottom) {
            int row = top + ( bottom - top) / 2;
            if( matrix[row][0] > target) {
                bottom = row - 1;
            }
            else if( matrix[row][totCol - 1] < target) {
                top = row + 1;
            }
            else {
                break;
            }
        }
        if( !(top <= bottom) ) {
            return false;
        }

        int row = top + ( bottom - top) / 2;
        int l = 0 , r = totCol - 1;
        while( l <= r ) {
            int m = l + (r - l)/2;
            if(target > matrix[row][m]) {
                l = m + 1;
            }
            else if(target < matrix[row][m]) {
                r = m - 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
