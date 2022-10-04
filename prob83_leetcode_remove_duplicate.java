// Step by Step solution:

// Step 1 : if the size of head is 0 or 1 then no duplicates possible, return head.

// Step 2: Take a current Node in order to traverse the head.

// Step 3: Take a new ListNode with value as head.val and next element as null which will be returned as answer.

// Step 4: Take one result node for traversal and addition of element into the new head linkedlist.

// Step 5: Take previos value as the first value of the given linked list(head).

// Step 6: Iterate throughout the head linked list and if the previous value is not equal to the current value then add the current value into the result node and then put the previous value = currentNode.val.

// Step 7: Finally after exiting the loop return the new Head as the answer.

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null) return head;
        
        // currNode for traversal of head
        ListNode currNode = head;
        
        ListNode newHead = new ListNode(head.val, null);
        ListNode resultNode = newHead;
        
        int prev = head.val;
        
        while(currNode!=null){
            
            int val = currNode.val;
            
            if(val!=prev){
                
                ListNode newNode = new ListNode(val, null);
                resultNode.next = newNode;
                resultNode = resultNode.next;
                prev = val;
                
            }
            
            currNode = currNode.next;
        }
        return newHead;
    }
}
