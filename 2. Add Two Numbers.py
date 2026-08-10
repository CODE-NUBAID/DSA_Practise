class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:

        s1, s2 = "", ""
        while l1:
            s1 = str(l1.val) + s1
            l1 = l1.next
        while l2:
            s2 = str(l2.val) + s2
            l2 = l2.next
        

        total = int(s1) + int(s2)
        

        dummy = ListNode(0)
        curr = dummy
        for digit in reversed(str(total)):
            curr.next = ListNode(int(digit))
            curr = curr.next
            
        return dummy.next