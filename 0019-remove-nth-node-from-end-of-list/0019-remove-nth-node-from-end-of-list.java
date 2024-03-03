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
        ListNode LastNode = head;
        int len = 1;
        while(LastNode.next != null){
            len++;
            LastNode = LastNode.next;
        }
        int i = 0;
        int limit = len - n-1;
        
        if(limit == -1){
            return head.next;
        }
        ListNode curr = head;
        while(i<limit){
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;

        return head;
    }
}