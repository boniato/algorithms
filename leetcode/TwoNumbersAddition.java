/**
 * URL : https://leetcode.com/problems/add-two-numbers
 * input l1 : 2,4,3
 * input l2 : 5,6,4
 * output :   7,0,8
 * explanation: 342 + 465 = 807
 */
public class TwoNumbersAddition {

    public static void main(String args[]) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        addTwoNumbers(l1, l2);
    }

    /**
     * Soultion
     * Time complexity: O(N)
     * Runtime: 1 ms
     * Memory Usage: 39.1 MB
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curHead = head;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            // compute digits
            int sum = val1 + val2 + carry; // 7,10,8
            carry = sum / 10; // 0,1,0
            sum = sum % 10;   // 7,0,8
            curHead.next = new ListNode(sum);

            // update pointers
            curHead = curHead.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            curHead.next = new ListNode(carry);
        }

        return head.next;
    }

}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
