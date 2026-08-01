void main() {
    class Solution {
        public String convertDateToBinary(String date) {

            String[] dates = date.split("-");
            String[] numbersStr = new String[3];
            int[] numbersInt = new int[3];
            for (int i = 0; i < dates.length; i++) {
                numbersInt[i] = Integer.parseInt(dates[i]);
                numbersStr[i] = Integer.toBinaryString(numbersInt[i]);
            }
            String result = String.join("-", numbersStr);
            return result;
        }
    }
}