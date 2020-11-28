public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<ListNode>();

        ListNode temp = head;
        while (temp != null) {
            if (visited.contains(temp)) {
                return temp;
            }
            visited.add(temp);
            temp = temp.next;
        }

        return null;
    }
}