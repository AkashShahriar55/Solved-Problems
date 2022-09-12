/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null)
            return null;
        
        ListNode pointer = headA;
        
        while(pointer.next != null){
            pointer = pointer.next;
        }
        
        pointer.next = headB;
        
        ListNode slow = headA;
        ListNode fast = slow.next;
        
        while(slow != fast){
        
            if(slow == null || fast == null || fast.next == null){
                pointer.next = null;
                return null;
            }
                
            
            System.out.println(slow.val+ " " + fast.val);
            
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        slow = headA;
        fast = fast.next;
        
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        pointer.next = null;
        
        
        return slow;
        
        
        
    }
}