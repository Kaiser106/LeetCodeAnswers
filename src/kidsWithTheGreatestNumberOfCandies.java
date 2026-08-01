void main() {


    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

            int m = candies.length;
            int maxCandies = 0;
            List<Boolean> result = new ArrayList<>();


            for (int i = 0; i < m; i++) {
                if (candies[i] > maxCandies) {
                    maxCandies = candies[i];
                }
            }


            for (int i = 0; i < m; i++) {

                result.add(candies[i] + extraCandies >= maxCandies);
            }

            return result;
        }
    }
}