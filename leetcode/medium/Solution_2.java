/**
 * author: seungw0n
 * description: question 2
 * details:
 *  Runtime: 2ms, faster than 82.41% of Java submissions
 *  Memory Usage: 47.8 MB, less than 53.68% of Java submissions
 * comment:
 *  Need to change the filename (Solution.java)
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tmp = head;
        
        int r = 0;
        
        while(true) {
            int val = 0;
            if (l1 != null && l2 != null)
                val = l1.val + l2.val;
            else if (l1 != null)
                val = l1.val;
            else if (l2 != null)
                val = l2.val;
            else {
                if (r == 1)
                    tmp.next = new ListNode(1);
                break;
            }
            
            if (r == 1) {
                val++;
                r = 0; // reset remainder
            }
            
            if (val >= 10) {
                r = 1;
                val = val - 10;
            }
            
            tmp.next = new ListNode(val);
            tmp = tmp.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            
        }
        return head.next;
    }
}
