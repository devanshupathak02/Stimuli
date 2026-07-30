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
    public ListNode rotateRight(ListNode head, int k) {
       if (head == null || head.next == null || k == 0) {
            return head;
       }
        int len =0;
        ListNode cnt = head;
        while(cnt!=null){
            cnt= cnt.next;
            len++;
        }
        k=k%len;
       ListNode list = head;
        while(k>0){
           ListNode tmp = list;
           while(tmp.next!=null && tmp.next.next!=null){
            tmp = tmp.next;
           }
           ListNode last = tmp.next;
           tmp.next = null;
           last.next = list;
           list = last;
           k--;
        }
        return list;
       
    }
}