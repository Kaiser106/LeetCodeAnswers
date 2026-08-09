void main() {
    class Solution {
        public int subsetXORSum(int[] nums) {
            int orSum = 0;


            for (int i = 0; i < nums.length; i++) {
                orSum = orSum | nums[i];
            }


            int carpan = (int) Math.pow(2, nums.length - 1);

            return orSum * carpan;
        }
    }
}