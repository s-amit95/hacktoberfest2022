class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> result = new ArrayList<>();
        double sum = 0, freq = 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            
            TreeNode curr = q.remove();
            
            if(curr == null){
                
                result.add(sum/freq);
                sum = 0;
                freq = 0;
                
                if(q.isEmpty()) break;
                else q.add(null);
                
            }
            else{
                sum += curr.val;
                freq++;
                
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            
        }
        return result;
    }
}
