void main() {
    class Solution {
        public int mySqrt(int x) {
            if (x < 2) {
                return x; // x = 0 ise 0, x = 1 ise 1 döner
            }

            int left = 1;
            int right = x / 2;
            int ans = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                long square = (long) mid * mid;

                if (square == x) {
                    return mid;
                } else if (square < x) {
                    ans = mid; // Aşağı yuvarlama için geçerli en büyük adayı tutuyoruz
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return ans;
        }
    }

}

