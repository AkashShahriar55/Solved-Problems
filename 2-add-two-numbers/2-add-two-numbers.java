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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        int reminder = 0;
        ListNode head = null;
        ListNode pointer = null;
        
        while(l1 != null || l2 != null ){
            int sum = 0;
            
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
               
            
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
                
            sum += reminder;
            reminder = sum/10;
            sum = sum%10;
            
            
            
            if(head == null){
                head = new ListNode(sum);
                pointer = head;
            }else{
                pointer.next = new ListNode(sum);
                pointer = pointer.next;
            }
        }
        
        
        if(reminder != 0)
            pointer.next = new ListNode(reminder);
        
    
        
        return head;
        
    }
}