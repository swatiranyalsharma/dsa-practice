public class Solution {
    public int[] nextGreater(int[] A) {
        int[] ansArray = new int[A.length];
        Stack<Integer> s= new Stack();
        for(int i= A.length -1;i>=0;i--){
            if(!s.isEmpty()){
                while(!s.isEmpty() && s.peek() <= A[i]){
                    s.pop();
                }
                 if(s.isEmpty()){
                    ansArray[i] =-1;   
                 }else{
                     ansArray[i] = s.peek();   
                 }
            }else{
                ansArray[i] =-1;   
            }
            s.push(A[i]);
        }
        return ansArray;
    }
}
