// Take two hashmap to store the character and its frequency.
// At last compare both of them if they are same then return true else false.

class Solution {
    public boolean isAnagram(String s, String t) {
        
        
        HashMap<Character, Integer> stores = new HashMap<>();
        HashMap<Character, Integer> storet = new HashMap<>();
        
        
        char chars_s[] = s.toCharArray();
        char chars_t[] = t.toCharArray();
        
        
        // inserting values into hashmap stores
        for(char ch : chars_s){
            if(stores.containsKey(ch)){
                stores.put(ch, stores.get(ch)+1);
            }
            else
                stores.put(ch, 1);
        }
        
        
        // inserting values into hashmap storet
        for(char ch : chars_t){
            if(storet.containsKey(ch)){
                storet.put(ch, storet.get(ch)+1);
            }
            else
                storet.put(ch, 1);
        }
        
        return stores.equals(storet);
    }
}
