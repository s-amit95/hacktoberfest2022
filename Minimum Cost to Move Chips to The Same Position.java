1217. Minimum Cost to Move Chips to The Same Position --> https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/


class Solution {
    public int minCostToMoveChips(int[] position) {
       int even_cnt = 0;
        int odd_cnt = 0;
        for(int i : position){
            if(i%2==0){
                even_cnt++;
            }
            else{
                odd_cnt++;
            }
        }
        return Math.min(even_cnt,odd_cnt);
    }
}