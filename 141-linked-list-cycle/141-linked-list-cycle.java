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
        
        
        ListNode hare = head;
        ListNode tortoise = head;
        
        while(hare != null && tortoise!= null){
            hare = hare.next;
            
            if(tortoise.next == null)
                return false;
            else{
                tortoise = tortoise.next.next;
            }
            
            if(hare == tortoise)
                return true;
            
            
        }
        
        return false;
        
    }
}