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
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = list1;
        int count = 1;
        ListNode tempNode1 = null;
        ListNode tempNode2 = null; 
        
        if(list1 != null){
            while(count != a){
                list1 = list1.next;
                count++;
            }
            tempNode1 = list1;
            count = count -1;
            while(count != b+1){
                count++;

                tempNode1 = tempNode1.next;
            }
            list1.next = list2;
            while(list1.next != null){
                list1 = list1.next;
            }
            list1.next = tempNode1;
        }
        ListNode dNode = dummyHead.next;
        while(dNode != null){
            System.out.println(dNode.val);
            dNode = dNode.next;
        }

        return dummyHead.next;
    }
}