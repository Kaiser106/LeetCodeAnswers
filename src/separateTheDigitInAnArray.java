void main() {
    class Solution {
        public int[] separateDigits(int[] nums) {
            List<Integer> list = new ArrayList<>();

            for (int num : nums) {
                List<Integer> temp = new ArrayList<>();
                while (num > 0) {
                    temp.add(0, num % 10); // Her basamağı listenin BAŞINA ekliyoruz ki sıra bozulmasın
                    num /= 10;
                }
                list.addAll(temp);
            }

            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }

            return result;
        }
    }
}