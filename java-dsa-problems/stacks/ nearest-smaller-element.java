public class Solution {
    public int[] prevSmaller(int[] A) {
        Stack<Integer> s = new Stack();
        // ArrayList<Integer> ansArrayList = new ArrayList<>();
        int[] ansArray = new int[A.length];
        for(int i=0;i<A.length;i++){
            if(!s.isEmpty()){
                while(!s.isEmpty() && !(s.peek()<A[i])){
                    s.pop();
                }
                // ansArrayList.add(s.peek());
                if(s.isEmpty()){
                     ansArray[i] = -1;
                }else{
                     ansArray[i] = s.peek();
                }
               
            }else{
                  ansArray[i] = -1;
                // ansArrayList.add(-1);
            }
            s.push(A[i]);
        }
        return ansArray;
    }
}
