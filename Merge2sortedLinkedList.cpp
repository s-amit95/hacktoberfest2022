#include<bits/stdc++.h>
using namespace std;
class node{
    public:
    int data;
    node *next;
    node (int data){
        this->data=data;
        next=NULL;
    }
    
};
void insertAtLast(node* &head,int value){
    node* ins=new node(value);
    
    if(head==NULL){
        head=ins;
        return;
    }
    node* temp=head; //changes in temp will also be reflected in head
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=ins;
}
int length(node* head){
    int cnt=0;
    while(head!=NULL){
        head=head->next;
        cnt++;
    }
    return cnt;
}
void display(node* head){
    cout<<"\n";
    if(head==NULL){
        cout<<"List is empty";
        return;
    }
    while(head!=NULL){
        cout<<head->data<<"->";
        head=head->next;
    }
    cout<<"NULL";

}
node* mergeRecursive(node* head1,node* head2){
    node* result;
    if(head1==NULL){
        return head2;
    }
    if(head2==NULL){
        return head2;
    }

    if(head1->data>head2->data){
        //cout<<"\n"<<head1->data<<" "<<head2->data;
        result=head2;
        result->next=mergeRecursive(head1,head2->next);
    }
    else{
        //cout<<"\n"<<head1->data<<" "<<head2->data;
        result=head1;
        result->next=mergeRecursive(head1->next,head2);

    }
    return result;
}
int main(){
    node* head1=NULL;
    insertAtLast(head1,4);
    insertAtLast(head1,8);
    insertAtLast(head1,9);
    insertAtLast(head1,12);
    
    node* head2=NULL;
    insertAtLast(head2,1);
    insertAtLast(head2,2);
    insertAtLast(head2,6);
    insertAtLast(head2,7);
    insertAtLast(head2,11);
    insertAtLast(head2,13);
    display(head1);
    display(head2);
    node* n=mergeRecursive(head1,head2);
    display(n);
    
    return 0;
}