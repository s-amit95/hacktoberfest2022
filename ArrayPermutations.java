//Hey everyone, In this problem, You'll be Given an array nums of distinct integers, and have to return all the possible permutations. You can return the answer in any order.
//Example : 
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

//Below is the code for the above problem

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int i = 0;
        recursion(i, nums);
        return res;
    }
    
    void recursion(int i, int[] nums) {
        if(i == nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int j : nums) list.add(j);
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int x = i; x < nums.length; x++){
            swap(i, x, nums); 
            recursion(i+1, nums);
            swap(i, x, nums);
        }
    }
    void swap(int i, int x, int[] nums){
        int temp = nums[i];
        nums[i] = nums[x];
        nums[x] = temp;
        return;
    }
}
