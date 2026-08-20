void main() {

    class Solution {
        public int getDecimalValue(ListNode head) {

            ListNode temp = head;
            StringBuilder build = new StringBuilder();
            while(temp != null){

                build.append(temp.val);

                temp=temp.next;


            }


            String str=build.toString();
            int j=0;
            int result=0;
            for(int i =str.length()-1;i>=0;i--){
                result+=Math.pow(2,j++)* (str.charAt(i)-'0');

            }

            return result;
        }
    }
}