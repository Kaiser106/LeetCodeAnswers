void main() {
    class Solution {
        public int minElement(int[] nums) {

            int minVal = Integer.MAX_VALUE;


            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                int digitSum = 0;


                while (num > 0) {
                    digitSum += num % 10;
                    num /= 10;
                }

                if (digitSum < minVal) {
                    minVal = digitSum;
                }
            }

            return minVal;
        }
    }
}