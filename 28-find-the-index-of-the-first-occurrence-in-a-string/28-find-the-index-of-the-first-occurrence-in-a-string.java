class Solution {
    public int strStr(String haystack, String needle) {
        
        int pointer = 0;
        for(int i = 0; i< haystack.length();i++){
            
           
            if(pointer == needle.length())
                break;
            
            // System.out.println(i+" " +pointer + " " + haystack.charAt(i) + " "+ needle.charAt(pointer));
            
            if(haystack.charAt(i) == needle.charAt(pointer)){
                pointer++;
            }else{
                if(pointer != 0){
                    i = i - pointer + 1;
                    while(i < haystack.length() && haystack.charAt(i) != needle.charAt(0)){
                        // System.out.println(i);
                        i++;
                    }
                    i--;
                }
               
                pointer = 0;
               
            }
            
          
            
            if(pointer == needle.length()){
                return i-pointer+1;
            }
        }
        
        return -1;
        
    }
}