void main() {
    class Solution {
        public int mirrorDistance(int n) {
            Integer reversed = Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
            int result = Math.abs(n - reversed);
            return result;
        }
    }
    
}