void main() {
    class Solution {
        public int findPermutationDifference(String s, String t) {
            int totalSum = 0;


            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);


                int indexInS = i;


                int indexInT = t.indexOf(ch);


                totalSum += Math.abs(indexInS - indexInT);
            }

            return totalSum;
        }
    }
}