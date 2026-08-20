void main() {
    class Solution {
        public int maximum69Number(int num) {

            String str = String.valueOf(num);
            int max = num;


            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == '6') {

                    StringBuilder builder = new StringBuilder(str);
                    builder.setCharAt(i, '9');
                    int in = Integer.parseInt(builder.toString());


                    max = Math.max(max, in);
                }

            }

            return max;

        }
    }
}