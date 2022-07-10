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
    
    ListNode head;
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        int carry = 0;
        ListNode temp = new ListNode((l1.val + l2.val + carry)%10);
        carry = (l1.val+l2.val)/10;
        head = temp;
        list(l1.next, l2.next, temp, carry);
        return head;
   
    }
    public void list(ListNode l1, ListNode l2, ListNode last, int carry){   
        
        if(l1 == null && l2 == null){
            if(carry != 0){
                ListNode temp = new ListNode(carry);
                last.next = temp;
            }
            return;
        }
        else if(l1 == null){
            while(l2 != null){
                ListNode temp = new ListNode((l2.val + carry)%10);
                carry = (l2.val + carry)/10;
                last.next = temp;
                last = temp;
                l2 = l2.next;
            }
            if(carry != 0){
                ListNode temp = new ListNode(carry);
                last.next = temp;
            }
            return;
        }
        else if(l2 == null){
            while(l1 != null){
                ListNode temp = new ListNode((l1.val + carry)%10);
                carry = (l1.val + carry)/10;
                last.next = temp;
                last = temp;
                l1 = l1.next;
                
            }
            if(carry != 0){
                ListNode temp = new ListNode(carry);
                last.next = temp;
            }
            return;
        }
        else{
            ListNode temp = new ListNode((l1.val + l2.val + carry)%10);
            carry = (l1.val + l2.val + carry)/10;
            last.next = temp;
            last = temp;
            list(l1.next, l2.next, last, carry);
        }
        

    }
}