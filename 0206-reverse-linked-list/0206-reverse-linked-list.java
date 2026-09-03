class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev=null;
        if(head==null){
            return head;
        }
        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}