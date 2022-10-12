class Solution {
    public void rotate(int[][] mat) {
        int n=mat.length;
        for(int i=0;i<n/2;i++)
        {
            for(int j=i;j<n-i-1;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[n-1-j][i];
                mat[n-1-j][i]=mat[n-i-1][n-j-1];
                mat[n-i-1][n-1-j]=mat[j][n-1-i];
                mat[j][n-1-i]=temp;
            }
        }
    }
}
// another method
// find transpose and reflect
class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
    }
    
    public void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }
    
    public void reflect(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
    }
}
