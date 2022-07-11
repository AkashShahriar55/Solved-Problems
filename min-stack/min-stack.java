class MinStack {
        Stack<Pair<Integer,Integer>> stack = new Stack();

        public MinStack() {
            
        }

        public void push(int val) {
            
            if(stack.size() == 0){
                stack.push(new Pair(val,val));
                return;
            }
            
            Pair<Integer,Integer> value = stack.peek();
            if(val < value.getValue() ){
                stack.push(new Pair(val,val));
            }else{
                stack.push(new Pair(val,value.getValue()));
            }
            
        }

        public void pop() {
            stack.pop();
        }

        public int top() {
            return stack.peek().getKey();
        }

        public int getMin() {
            return stack.peek().getValue();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */