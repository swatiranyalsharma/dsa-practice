public class Solution {
    public int solve(int A, int B, int[] C) {
        Stack<Integer> s = new Stack();
        s.push(B);
        for(int i=0;i<A;i++){
            if(C[i]!=0){
                s.push(C[i]);
                //push index to stack
            }else{
                if(!s.isEmpty()){
                     s.pop();
                }
                //pop index from the stack
            }
        }
        if(!s.isEmpty()){
            return s.peek();
        }
        return -1;
    }
}
