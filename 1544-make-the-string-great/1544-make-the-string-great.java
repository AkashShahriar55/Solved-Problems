class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack();
        
        for(int i = 0; i< s.length();i++){
        
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            Character str = stack.peek();
            if(Math.abs(str - s.charAt(i)) == 32  ){
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