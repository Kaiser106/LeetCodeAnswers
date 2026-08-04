void main() {
    class Solution {
        public int balancedStringSplit(String s) {
            int count=0;
            int ans=0;
            char x;
            for (int i = 0; i < s.length(); i++) {
                x=s.charAt(i);
                if (x == 'R') {
                    count++;
                }
                {
                    count--;
                }

                if(count==0)
                    ans++;


            }


            return ans;
        }
    }
}