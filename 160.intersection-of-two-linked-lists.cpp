// 160. Intersection of Two Linked Lists
#include<bits/stdc++.h>
using namespace std;

class ListNode {
    public:
        int data;
        ListNode* next;

    public:
        ListNode(int data){
            this->data = data;
            this->next = NULL;
        }
};

void insertAtTail(ListNode* &tail, int data){
    ListNode* temp = new ListNode(data);
    tail->next = temp;
    tail = tail->next;
}

void print(ListNode* &head){
    ListNode* temp = head;
    while(temp != NULL){
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

ListNode *getIntersectionNode(ListNode *head1, ListNode *head2) {
    ListNode* temp1 = head1;
    ListNode* temp2 = head2;

    if(head1 == NULL || head2 == NULL)
        return nullptr;
    
    while(temp1 != temp2){

        if (temp1 == NULL)
            temp1 = head2;
        else
            temp1 = temp1->next;
        
        if (temp2 == NULL)
            temp2 = head1;
        else
            temp2 = temp2->next;
    }

    if(temp1 == NULL)
        return nullptr;
    else
        return temp1;
}

int main(){
    
    // LL-1 
    ListNode* node1 = new ListNode(1);
    
    ListNode* head1 = node1;
    ListNode* tail1 = node1;

    insertAtTail(tail1, 2);
    insertAtTail(tail1, 3);
    insertAtTail(tail1, 4);
    insertAtTail(tail1, 5);
    insertAtTail(tail1, 6);
    
    // to connect second list
    ListNode* temp = tail1;
    insertAtTail(tail1, 7);
    insertAtTail(tail1, 9);
    insertAtTail(tail1, 8);
    insertAtTail(tail1, 10);
    insertAtTail(tail1, 11);

    
    // LL-2
    ListNode* node2 = new ListNode(15);
    
    ListNode* head2 = node2;
    ListNode* tail2 = node2;
    
    insertAtTail(tail2, 14);
    insertAtTail(tail2, 13);
    insertAtTail(tail2, 12);

    tail2->next = temp;
    
    print(head1);
    print(head2);

    ListNode* head = getIntersectionNode(head1, head2);

    cout << head->data << endl;

    return 0;
}