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
    public ListNode removeElements(ListNode head, int val) {
        // if Node.val == val, disconnect
        
        ListNode currentNode = head;
        ListNode prevNode = null;
        
        if(head == null) return null;
        
        while(currentNode != null){
            if(currentNode.val == val){
                if(prevNode != null){
                    prevNode.next = currentNode.next;
                }else{
                    head = currentNode.next;
                }
            }
            else{
                prevNode= currentNode;
            }
            currentNode = currentNode.next;
        }
        return head;
    }
}

