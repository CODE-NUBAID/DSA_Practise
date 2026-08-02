class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        # Step 1: Extract digits and reverse them back to standard order
        s1, s2 = "", ""
        while l1:
            s1 = str(l1.val) + s1
            l1 = l1.next
        while l2:
            s2 = str(l2.val) + s2
            l2 = l2.next
        
        # Step 2: Sum the numbers (Python handles arbitrarily large integers automatically)
        total = int(s1) + int(s2)
        
        # Step 3: Build the result linked list in reverse order
        dummy = ListNode(0)
        curr = dummy
        for digit in reversed(str(total)):
            curr.next = ListNode(int(digit))
            curr = curr.next
            
        return dummy.next