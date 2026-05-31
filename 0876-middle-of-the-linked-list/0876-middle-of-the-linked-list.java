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
        
        int size = 0;

        ListNode node = head;
        while(node != null){
            size +=1;
            node=node.next;
        }
        node = head;
        int sz = size/2;
        for(int i=1;i <= sz;i++){
            node =node.next;
        }
        return node;
    }
}