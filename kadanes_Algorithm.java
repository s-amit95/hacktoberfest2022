// Kadanes algorithm states that if we go through an array, 
// if we keep on adding positive numbers then there is no issue at all, 
// but as soon as we start adding a negative value, the problem with start comint, for example :

// int arr[] = {1, -2, 3}

// If we take sum of all then we will get 2 
//  but the actual max value would come out to be 3 from the sub array, 
// likewise we need to check that if the previous values are coming out to be smaller than 0 
// then we need to stop taking sum and initialising sum = 0, here in this case, 
// we need to stop at -2 as the sum will be -1(smaller than 0) and again sum will start from 3 at index 2, 
// and at the very same time it will check whether the value of sum > max, if yes then at every iteration max value will also change.

class Solution {
    
    // Use of kadanes algorithm.
    public int maxSubArray(int[] nums) {
       
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for( int i = 0; i < nums.length; i++){
            
            sum += nums[i];
            
            if(sum>max)
                max = sum;
            
            if(sum<0)
                sum = 0;
            
        }
        return max;
    }
}
