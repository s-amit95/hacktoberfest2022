#include <iostream>
using namespace std;
class selection_sort
{
    int i;
    int j;
    int small;
    int count;

public:
    void do_sort(int n, int arr[])
    {

        for (i = 0; i < n; i++)
        {
            small = arr[i];
            // cout<<small<<"  ";
            for (j = i; j < n ; j++)
            {
                if (small >= arr[j])
                {
                    small = arr[j];
                    count = j;
                }
            }
            arr[count] = arr[i];
            arr[i] = small;
            // cout<<arr[i]<<"  "<<small;        
        }
    }
    void display(int n, int arr[])
    {
        cout<<"\nsorting done successfully!!!\n";
        for (i = 0; i < n; i++)
        {
            cout << arr[i] << "  ";
        }
    }
};
int main()
{
    int arr[] = {5, 6, 2, 3, 11, 4, 9, 7, 8, 888, 95,7776,-5,1,66,55,44,66};
    int n;
    n = ((sizeof(arr)) / 4);
    selection_sort active;
    active.do_sort(n, arr);
    active.display(n, arr);
    return 0;
}