package LinkedList;

public class ListNode {
      final int val; //Added final
      ListNode next;
      private boolean isEmpty = true;

      ListNode() {val = 0;}
      ListNode(final int val) { this.val = val; isEmpty = false; }
      ListNode(final int val, ListNode next) { this.val = val; this.next = next; isEmpty = false;}

        @Override
        public String toString() {
            String result = " ";
            if(isEmpty) { return "[]"; }
            ListNode current = null;
            current = this;
            while (current != null) {
                result += current.val + " ";
                current = current.next;
            }
            return result;
        }
}


