void main() {
//    class Solution {
//        public int maxFreqSum(String s) {
//            Character[] letters = new Character[s.length()];
//            for(int i =0 ;i<s.length();i++){
//                letters[i]=s.charAt(i);
//            }
//            for(Character letter : letters){
//
//
//
//            }


    class Solution {
        public int maxFrequencySum(String s) {
            int[] frekans = new int[26];


            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                frekans[c - 'a']++;
            }

            int enCokSesli = 0;
            int enCokSessiz = 0;


            for (int i = 0; i < 26; i++) {
                char c = (char) ('a' + i);


                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    if (frekans[i] > enCokSesli) {
                        enCokSesli = frekans[i];
                    }
                } else {
                    if (frekans[i] > enCokSessiz) {
                        enCokSessiz = frekans[i];
                    }
                }
            }
            return enCokSesli + enCokSessiz;
        }
    }

}

