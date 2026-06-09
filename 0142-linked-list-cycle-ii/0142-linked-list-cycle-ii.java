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
    public ListNode detectCycle(ListNode head) {
        
        
        ListNode fast = head;
        ListNode slow = head;
        int length=0;
        boolean cycleFound = false;
        if(head == null){
            return null;
        }
        while(fast !=null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                
                cycleFound = true;
                ListNode temp = slow;
                
                do{
                    temp = temp.next;
                    length +=1;
                }while(temp != slow);
                break;
            }
            
        }

        if (!cycleFound){
            return null;
        }
        ListNode f = head;
        ListNode s = head;

        for(int i = 0 ;i < length;i++){
            s=s.next;
        }

        while (f != s){
            f= f.next;
            s=s.next;
        }
        return f;

    }
}