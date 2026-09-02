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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head , fast = head;
        if(head.next==null){
            return true;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        ListNode current = slow;
        ListNode prev = null;
        while(current!=null){
            ListNode next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        while(prev!=null){
            if(head.val!=prev.val){
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}