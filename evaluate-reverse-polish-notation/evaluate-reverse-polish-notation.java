class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        List<String> operators = Arrays.asList(
            "+",
            "-",
            "*",
            "/"
        );
        for(String token : tokens){
            
            if(operators.contains(token)){
                int value2 = stack.pop();
                int value1 = stack.pop();
                int result = 0;
                if(token.equals("+")){
                    result = value1 + value2;
                }else if(token.equals("-")){
                    result = value1 - value2;
                }else if(token.equals("*")){
                    result = value1*value2;
                }else if(token.equals("/")){
                    result = value1/value2;
                }
                
                stack.push(result);
            }else{
                int value = Integer.parseInt(token);
                stack.push(value);
            }
            
        }
        
        return stack.pop();
        
    }
}