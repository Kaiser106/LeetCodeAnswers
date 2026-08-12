void main() {
    class Solution {
        public int[] numberGame(int[] nums) {
            Arrays.sort(nums);
            int temp=0;
            for(int i =0; i< nums.length-1;i+=2){
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
            return nums;
        }
    }
}