class Solution {
    public boolean searchInRow(int[][] mat, int target, int row) {
        int n = mat[0].length;
        int st = 0, end = n-1;

        while(st <= end) {
            int mid = st + (end - st)/ 2;

            if(target == mat[row][mid]) {
                return true;
            }
            else if(target > mat[row][mid]) {
                 st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int target) {
        int m = mat.length, n = mat[0].length;

        int stRow = 0, endRow = m - 1;
        while(stRow <= endRow) {
            int midRow = stRow + (endRow - stRow) / 2;

            if(target >= mat[midRow][0] && target <= mat[midRow][n-1]) {
                return searchInRow(mat, target, midRow);
            }
            else if(target > mat[midRow][n-1]) {
                stRow = midRow + 1;
            }
            else {
                endRow = midRow - 1;
            }
        }
        return false;
    }
}
