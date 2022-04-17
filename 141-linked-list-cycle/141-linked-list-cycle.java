/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // 1. fast, slow
        // 2. to mark a node
        if( head == null ) return false;
        
        while(head.next != null) {
            head.val = Integer.MAX_VALUE;
            if(head.next.val == Integer.MAX_VALUE) {
                return true;
            } else {
                head = head.next;
            }
        }
        return false;
    }
}