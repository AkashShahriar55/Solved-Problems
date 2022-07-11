class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack();
        stack.push(0);
        for(int i = 1; i < temperatures.length;i++){
            
            while(stack.size()>0 && temperatures[i] > temperatures[stack.peek()] ){
                int position = stack.pop();
                result[position] = i-position;
            }
            
            stack.push(i);
        }
        
        return result;
    }
}