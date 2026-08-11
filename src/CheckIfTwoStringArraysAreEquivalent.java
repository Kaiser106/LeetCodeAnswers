void main() {
    class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

            String first=Builder(word1);
            String second=Builder(word2);

            if(Objects.equals(first,second))
                return true;

            return false;



        }

        public String Builder(String[] word) {
            StringBuilder builder = new StringBuilder();

            for(String words:word){
                builder.append(words);

            }

            return builder.toString();
        }




    }


}