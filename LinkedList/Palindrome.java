/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    
    while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
    }
    
    ListNode temp = null;
    while (slow != null) {   // reverse half list
        ListNode nxt = slow.next;
        slow.next = temp;
        temp = slow;
        slow = nxt;
    }
    while (temp != null) {
        if (temp.val != head.val) {
            return false;
        } 
        temp = temp.next;
        head = head.next;
    }
    return true; 
    
    }
}