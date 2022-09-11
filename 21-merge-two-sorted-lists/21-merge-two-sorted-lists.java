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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        ListNode head = null;
        ListNode mainHead = null;
        
        
        while(pointer1 != null && pointer2 != null){
            
            if(pointer1.val < pointer2.val){
                if(head == null){
                    head = pointer1;
                    mainHead = head;
                }else{
                    head.next = pointer1;
                    head = head.next;
                }
                 pointer1 = pointer1.next;
            }else{
                if(head == null){
                    head = pointer2;
                    mainHead = head;
                }else{
                    head.next = pointer2;
                    head = head.next;
                }
                pointer2 = pointer2.next;
            }
            
        }
        
        if(pointer1 != null){
            if(head == null){
                mainHead = pointer1;
            }else{
                head.next = pointer1;
            }
          
        }
        
        if(pointer2 != null){
             if(head == null){
                mainHead = pointer2;
            }else{
                head.next = pointer2;
            }
         
        }
        
        return mainHead;
        
    }
}