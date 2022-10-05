class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def getIntersectionNode(headA: ListNode, headB: ListNode) -> Optional[ListNode]:
    list1, list2 = [],[]
    while headA:
        list1.insert(0,headA)
        headA = headA.next
    while headB:
        list2.insert(0,headB)
        headB = headB.next
    node = None
    for i in range(min(len(list1), len(list2))):
        if list1[i] == list2[i]:
            node = list1[i]
        else:
            break
    return node