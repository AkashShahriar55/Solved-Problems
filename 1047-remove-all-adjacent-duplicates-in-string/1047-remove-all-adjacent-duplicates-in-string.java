class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack();
        
        
        for(int i = 0; i< s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            
            if(stack.peek() == s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
            
        }
        
        String ans = "";
        
        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }
        
        return ans;
    }
}