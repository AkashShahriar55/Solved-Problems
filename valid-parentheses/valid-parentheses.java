class Solution {
     public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        
        for(char character:s.toCharArray()){
            if(stack.size() > 0 && stack.peek() == counterPart(character)){
                stack.pop();
            }else{
                stack.push(character);
            }
        }
        
        return stack.size() == 0;
        
    }
    
     private char counterPart(char c){
        switch (c){
            case ')': return '(';
            case ']': return '[';
            case '}': return '{';
        }
        
        return ' ';
        
    }
}