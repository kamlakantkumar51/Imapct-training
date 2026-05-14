class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n = mat.length;
        int ans[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[i][j] = mat[n-i-1][n-j-1];
            }
        }
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = ans[i][j];
            }
        }
    }
}
