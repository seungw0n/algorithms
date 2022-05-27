/**
 * author: seungw0n
 * question: Remove Nth Node From End of List
 * details: Do this in one pass
 *  Runtime: 1 ms, faster than 56.49% of Java online submissions for Remove Nth Node From End of List.
 *  Memory Usage: 42.4 MB, less than 35.53% of Java online submissions for Remove Nth Node From End of List.
 * comment:
 *  
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        ListNode[] lst = new ListNode[31];
        
        
        int index = 0;
        ListNode currentNode = head;
        while(true) {
            if (currentNode == null) break;
            lst[index] = currentNode;
            index++;
            currentNode = currentNode.next;
        }
        
        // Case 1: if max index is equal to n
        if (index + 1 == n) {
            // In this case, there's no prev node
            ListNode result = head.next;
            return result;
        }
        
        // Case 2: if max index is larger than n
        index = index - 1;
        ListNode prevNode = lst[index - n];
        ListNode nextNode = lst[index - n + 2];
        
        if (prevNode == null) return null;
        prevNode.next = nextNode;
        return head;
    }
}
