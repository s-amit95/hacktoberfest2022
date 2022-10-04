class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()==1)
            return 1;
        
        int maxCount = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            List<Character> store = new ArrayList<>();
            int count = 0;
            
            for(int j = i; j < s.length(); j++){
                
                if(store.contains(s.charAt(j))){
                    if(count>maxCount)
                        maxCount = count;
                    break;
                }
                count++;
                store.add(s.charAt(j));
            }
            
            if(count>maxCount)
                maxCount = count;
            
        }
        return maxCount;
    }
}
