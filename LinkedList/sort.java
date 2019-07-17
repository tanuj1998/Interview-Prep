/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    private ListNode merge(ListNode A, ListNode B) {
        if(A == null) {
            return B;
        }
        if(B == null) {
            return A;
        }
        
        ListNode result = new ListNode(0);
        ListNode it = result;
        ListNode a = A;
        ListNode b = B;
        
        while(a != null && b != null) {
            if(a.val < b.val) {
                it.next = a;
                a = a.next;
                
            }
            else{
                it.next = b;
                b = b.next;
            }
            
            it = it.next;
            it.next = null;
        }
        if(a!=null){
            it.next = a;
        } 
        else if(b!=null){
            it.next = b;
        }
        return result.next;
    }
    
    public ListNode sortList(ListNode A) {
        if(A == null || A.next == null) {
            return A;
        }
        
        ListNode slow = A;
        ListNode fast = A.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        fast = slow.next;
        slow.next = null;
        return merge(sortList(A), sortList(fast));
    }
}