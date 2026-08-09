void main() {
    class Solution {
        public void rotate(int[][] matrix) {
            int m = matrix.length;
            int oldVal = 0;
            for (int i = 0; i < m; i++) {
                for (int j = i; j < m; j++) {
                    oldVal = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = oldVal;


                }
            }
            for (int i = 0; i < m; i++) {
                int left = 0;
                int right = m - 1;
                while (left < right) {
                    int temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = temp;

                    left++;
                    right--;
                }
            }


        }
    }
}