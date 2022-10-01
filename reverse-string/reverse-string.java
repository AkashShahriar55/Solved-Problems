class Solution {
    public void reverseString(char[] s) {
        recursion(s,0,s.length-1);
    }
    
    
    private void recursion(char[] s , int firstIndex ,int lastIndex){
        if(firstIndex >= lastIndex)
            return;
        
        char temp = s[lastIndex];
        s[lastIndex] = s[firstIndex];
        s[firstIndex] = temp;
        recursion(s,firstIndex+1,lastIndex-1);
    }
    
    
    
}