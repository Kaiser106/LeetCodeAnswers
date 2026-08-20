void main() {
    class Solution {
        public char findTheDifference(String s, String t) {

            int[] letters = new int[26];
            for (int i=0;i<s.length();i++){

                letters[s.charAt(i)-'a']+=1;
            }
            for (int i=0;i<t.length();i++){

                letters[t.charAt(i)-'a']-=1;

                if( letters[t.charAt(i)-'a']==-1)

                    return t.charAt(i);
            }   return '\0';



        }
    }
}