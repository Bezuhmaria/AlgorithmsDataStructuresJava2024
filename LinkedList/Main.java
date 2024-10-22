package LinkedList;

public class Main {
    public static void main(String[] args) {
        final ListNode list1_1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        final ListNode list1_2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        final ListNode list2_1 = new ListNode();
        final ListNode list2_2 = new ListNode();

        final ListNode list3_1 = null;
        final ListNode list3_2 = new ListNode(0);

        final Solution solution = new Solution();

        final ListNode list1 = solution.mergeTwoLists(list1_1, list1_2);
        System.out.println(list1.toString());

        final ListNode list2 = solution.mergeTwoLists(list2_1, list2_2);
        System.out.println(list2.toString());

        final ListNode list3 = solution.mergeTwoLists(list3_1, list3_2);
        System.out.println(list3.toString());
    }
}
