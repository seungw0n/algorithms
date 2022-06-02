/**
 * author: seungw0n
 * question: Merge In Between Linked Lists
 * details:
 *  Runtime: 3 ms, faster than 20.26% of Java online submissions for Merge In Between Linked Lists.
 *  Memory Usage: 108.3 MB, less than 20.74% of Java online submissions for Merge In Between Linked Lists.
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // find two nodes at a-1 and b+1
        int index = 0;
        ListNode temp = list1;
        ListNode start = null;
        ListNode end = null;

        while (temp != null) {
            if (index == a-1) {
                start = temp;
            } else if (index == b+1) {
                end = temp;
                break;
            }
            index++;
            temp = temp.next;
        }

        start.next = list2;
        
        temp = list2;
        while(true) {
            temp = temp.next;
            if (temp.next == null) {
                temp.next = end;
                break;
            }
        }
        
        return list1;
        
    }
}
