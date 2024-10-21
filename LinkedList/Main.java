package LinkedList;

public class Main {
    public static void main(String[] args) {
        ListNode list1_1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list1_2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode list2_1 = new ListNode();
        ListNode list2_2 = new ListNode();

        ListNode list3_1 = new ListNode();
        ListNode list3_2 = new ListNode(0);

        Solution solution = new Solution();

        ListNode list1 = solution.mergeTwoLists(list1_1, list1_2);
        System.out.println(list1.toString());

        ListNode list2 = solution.mergeTwoLists(list2_1, list2_2);
        System.out.println(list2.toString());

        ListNode list3 = solution.mergeTwoLists(list3_1, list3_2);
        System.out.println(list3.toString());
    }
}
