public class RemoveDuplicatesFromSortedList {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;

            while (current != null && current.next != null) {
                ListNode nextNode = current.next;
                if (current.val == nextNode.val) {
                    current.next = nextNode.next;
                } else {
                    current = nextNode;
                }
            }

            return head;
        }
    }

}
