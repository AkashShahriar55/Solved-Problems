class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        int i = 0;
        int j = sb.length() -1;
        
        while(i < j){
            if(!isVowel(sb.charAt(i))){
                i++;
            }
            
            if(!isVowel(sb.charAt(j))){
                j--;
            }
            
            if(isVowel(sb.charAt(i)) && isVowel(sb.charAt(j))){
                char temp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,temp);
                i++;
                j--;
            }
        }
        
        return sb.toString();
    }
    
    private boolean isVowel(char c){
        switch(c){
            case 'a': return true;
            case 'e': return true;
            case 'i': return true;
            case 'o': return true;
            case 'u': return true;
            case 'A': return true;
            case 'E': return true;
            case 'I': return true;
            case 'O': return true;
            case 'U': return true;
            default: return false;
        }
      
    }
}