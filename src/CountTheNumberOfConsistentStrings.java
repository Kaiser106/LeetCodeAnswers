void main() {
    class Solution {
        public int countConsistentStrings(String allowed, String[] words) {
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                boolean isConsistent = true;

                for (int j = 0; j < word.length(); j++) {
                    String letter = String.valueOf(word.charAt(j));

                    if (!allowed.contains(letter)) {
                        isConsistent = false;
                        break;
                    }
                }

                if (isConsistent) {
                    count++;
                }
            }

            return count;
        }
    }

}