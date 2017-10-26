
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nodeStart = null;
        ListNode previousNode = null;

        ListNode l1it = l1;
        ListNode l2it = l2;

        int carry = 0;
        while (l1it != null || l2it != null) {
            int val1 = (l1it != null) ? l1it.val : 0;
            int val2 = (l2it != null) ? l2it.val : 0;
            int sum = val1 + val2 + carry;

            l1it = l1it != null ? l1it.next : null;
            l2it = l2it != null ? l2it.next : null;
            carry = 0;
            if (sum >= 10) {
                sum -= 10;
                carry = 1;
            }
            ListNode newNode = new ListNode(sum);
            if (nodeStart == null) {
                nodeStart = newNode;
                previousNode = nodeStart;
            } else {
                previousNode.next = newNode;
                previousNode = newNode;
            }
        }

        if (carry == 0)
            return nodeStart;
        else {
            previousNode.next = new ListNode(1);
            return nodeStart;
        }
    }


}
