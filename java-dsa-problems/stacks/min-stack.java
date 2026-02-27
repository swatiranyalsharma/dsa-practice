class Solution {
    Stack<Integer> stack = new Stack();
    Stack<Integer> minStack = new Stack();

    public void push(int x) {
        stack.push(x);
        int min = Integer.MAX_VALUE;
        if(!minStack.isEmpty()) {
            min = minStack.peek();
        }
        if(x < min){
            min = x;
        }
        minStack.push(min);
    }

    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
         
        }
         if(!minStack.isEmpty()){
             minStack.pop();
         }
    }

    public int top() {
        if(stack.isEmpty()){
            return -1;
        }
       return stack.peek(); 
    }

    public int getMin() {
        if(stack.isEmpty()){
            return -1;
        }
        return minStack.peek();
    }
}
