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

    public ListNode middleNode(ListNode node){
        //edge case
        if(node == null){
            return node;
        }
        ListNode s= node;
        ListNode f = node;
        while(f !=null && f.next !=null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public ListNode reverse(ListNode head){
        //edge case
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }

        return prev;



    }

    public boolean isPalindrome(ListNode head) {
        
        ListNode headSecond = middleNode(head);
        ListNode reverseSecond = reverse(headSecond);

        //compare both the halves

        while( head != null && reverseSecond != null ){

            if(head.val != reverseSecond.val){
                return false;
            }
            head = head.next;
            reverseSecond = reverseSecond.next;
        }

       return true;



    }
}