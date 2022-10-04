#include <iostream>
using namespace std;
class bubblesort
{
private:
    int i;
    int j;
    int temp;
    int m;

public:
    void sort_it(int n, int arr[])
    {
        m = n;
        for (i = 0; i < 8; i++)
        {
            for (j = 0; j < m - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            m--;
        }
        cout<<"\nsorting done\n";
    }
    void display(int n, int arr[])
    {
        for (i = 0; i < n; i++)
        {
            cout << arr[i] << "  ";
        }
    }
};
int main()
{

    int arr2[100];
    int arr[] = {5, 6, 2, 3, 11, 4, 9, 7,8,99,888,95};
    bubblesort active;
    int n;
    n = ((sizeof(arr))/4);

    active.sort_it(n, arr);
    active.display(n, arr);
    // active.sort_it(n, arr2);
    // active.display(n, arr2);
    // cout <<endl<<sizeof(arr);
    //     cout <<endl<<sizeof(arr2);
    return 0;
}