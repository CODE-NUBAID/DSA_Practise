import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> visitedNodes = new HashSet<>();
        ListNode curr = head;

        while (curr != null) {
            if (visitedNodes.contains(curr)) {
                return true;
            }
            visitedNodes.add(curr);
            curr = curr.next;
        }

        return false;
    }
}
