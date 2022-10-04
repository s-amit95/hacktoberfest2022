// There are two loop:
// 1: Outer loop to find the row in which element may be present
// 2: Inner loop, if the particular row is found then we try to find the element in the corresponding row.

// In both the loops BINARY SEARCH is being used for efficiency as elements are sorted.
// If the program enters the inner loop then it means that we cannot find the
// element any where except the selected row, so if we don't find the element after exiting from inner loop then we will break the outer loop as well.

// For better understand please go through videos of Binary Search Algorithm.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0, j = row-1;
        boolean found = false;
        
        // Binary search for searching the row where element may be present
        while(i<=j){
            int mid = (i+j)/2;
            
            if(target>=matrix[mid][0] && target<=matrix[mid][col-1]){
                
                int low = 0, high = col-1;
                
                // loop to check element inside a row
                while(low<=high){
                    
                    int mid_2 = (low+high)/2;
                    
                    if(target==matrix[mid][mid_2]){
                        found = true;
                        break;
                    }
                    else if(target>matrix[mid][mid_2])
                        low = mid_2+1;
                    else
                        high = mid_2-1;
                    
                }
                // breaking the outer loop, because if element is not found here then 
                // it is not present in the matrix
                break;
                
            }
            
            else if(target>matrix[mid][col-1])
                i = mid+1;
            else
                j = mid-1;
            
        }
        return found;
    }
}
