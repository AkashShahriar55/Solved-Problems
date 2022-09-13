class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> set = new HashMap();
        char[] charArray = s.toCharArray();
        
        int globalMax = 0;
        int localMax = 0;
     
        int position = 0;
        
        for(char c:charArray){
            if(set.containsKey(c)){
                if(position - set.get(c) <= localMax){
                     localMax = position - set.get(c) ;
                }else{
                    localMax++;
                }
               
                // set.clear();
                set.put(c,position);
            }else{
                set.put(c,position);
                localMax++;
            }
         
            globalMax = Math.max(localMax,globalMax);
            position++;
            // System.out.println(localMax);
            
        }
        
        
        return globalMax;
    }
}