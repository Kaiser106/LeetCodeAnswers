void main() {


    class Solution {
        public int maxWidthOfVerticalArea(int[][] points) {
            int n = points.length;
            int[] xCoords = new int[n];


            for (int i = 0; i < n; i++) {
                xCoords[i] = points[i][0];
            }


            Arrays.sort(xCoords);

            int maxWidth = 0;


            for (int i = 0; i < n - 1; i++) {
                int currentWidth = xCoords[i + 1] - xCoords[i];

                if (currentWidth > maxWidth) {
                    maxWidth = currentWidth;
                }
            }

            return maxWidth;
        }
    }
}