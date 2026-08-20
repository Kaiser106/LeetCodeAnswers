void main() {
    class Solution {
        public ListNode reverseList(ListNode head) {
            LinkedList<Integer> reverse = new LinkedList<>();
            ListNode temp = head;

            while (temp != null) {
                reverse.add(temp.val);
                temp = temp.next;
            }

            temp = head;
            for (int i = reverse.size() - 1; i >= 0; i--) {
                temp.val = reverse.get(i);
                temp = temp.next;
            }

            return head;
        }
    }
}