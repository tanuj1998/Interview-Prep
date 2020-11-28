class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy= new ListNode(0);
        ListNode ptr1 = dummy;
        ListNode ptr2 = dummy;
        dummy.next = head;
        
        for(int i=0;i<n;i++){
            ptr2  = ptr2 .next;
        }
        while(ptr2 .next!=null){
            ptr1 = ptr1.next;
            ptr2  = ptr2 .next;
        }
        ptr1.next = ptr1.next.next;
        return dummy.next; 
    }
}