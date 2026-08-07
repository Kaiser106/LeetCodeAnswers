void main() {
    class Solution {
        public int[] decompressRLElist(int[] nums) {
            int length = nums.length;
            int[] even = new int[length / 2];
            int[] odd = new int[length / 2];

            int totalLength = 0;


            for (int i = 0; i < length; i += 2) {
                even[i / 2] = nums[i];
                odd[i / 2] = nums[i + 1];
                totalLength += nums[i];
            }


            int[] result = new int[totalLength];
            int resultIndex = 0;


            for (int i = 0; i < even.length; i++) {
                for (int j = 0; j < even[i]; j++) {
                    result[resultIndex] = odd[i];
                    resultIndex++;
                }
            }

            return result;
        }
    }
}