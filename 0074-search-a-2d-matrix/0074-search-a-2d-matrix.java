class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int n = matrix.length;
       int m = matrix[0].length;
    
        int low = 0 ; int high = (n*m)-1;
        while(low<=high){
            int mid = low + (high - low)/2;

            int rows = mid/m;
            int column = mid%m;

            if(matrix[rows][column]==target)  return true;
            if(matrix[rows][column]>target)  high = mid-1;
            else  low = mid+1;
        }

        return false;
    }
}