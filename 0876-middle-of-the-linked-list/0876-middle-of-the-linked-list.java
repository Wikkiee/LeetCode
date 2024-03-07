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
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode fastNode = head;
        ListNode slowNode = head;
        while(fastNode != null){
            if(fastNode.next != null && fastNode.next.next != null){
                fastNode = fastNode.next.next;
                           slowNode = slowNode.next;
            }else if(fastNode.next != null){
                fastNode = fastNode.next;
                slowNode = slowNode.next;
            }else{
                fastNode = null;
            }
 
        }
        System.out.println(slowNode.val);
        return slowNode;
    }
}