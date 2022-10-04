// GFG PROBEM
// Problem: Given an array of integers, sort the array in ascending order using the Quick Sort algorithm.
//{ Driver Code Starts
#include <stdio.h>
#include <bits/stdc++.h>
using namespace std;

/* Function to print an array */
void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

// } Driver Code Ends
class Solution
{
    public:
    //Function to sort an array using quick sort algorithm.
    void quickSort(int arr[], int low, int high)
    {
        if(low<high){
            int mid = partition(arr,low,high);
            
            quickSort(arr,low,mid-1);
            quickSort(arr,mid+1,high);
            return;
        }
    }
    
    public:
    int partition (int arr[], int low, int high)
    {
       if(low==high){
           return low;
       }
       
       int p = arr[low];
       int i = low;
       for(int j=low+1; j<=high; j++){
            if(arr[j] <= p){
                i++;
                swap(arr[i] , arr[j]);
            }
        }
        
        swap(arr[i],arr[low]);
        return i;
    }
};


//{ Driver Code Starts.
int main()
{
    int arr[1000],n,T,i;
    scanf("%d",&T);
    while(T--){
    scanf("%d",&n);
    for(i=0;i<n;i++)
      scanf("%d",&arr[i]);
      Solution ob;
    ob.quickSort(arr, 0, n-1);
    printArray(arr, n);
    }
    return 0;
}
// } Driver Code Ends