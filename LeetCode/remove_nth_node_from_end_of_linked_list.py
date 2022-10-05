class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def removeNthFromEnd(head: Optional[ListNode], n: int) -> Optional[ListNode]:
    firstNode = head
    nthNode = head
    for i in range(n):
        nthNode = nthNode.next
    # print(nthNode)
    if nthNode is None:
        return head.next
    while nthNode.next:
        firstNode = firstNode.next
        nthNode = nthNode.next
    if firstNode.next:
        firstNode.next = firstNode.next.next
    else:
        return firstNode.next
    return head