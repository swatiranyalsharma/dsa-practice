public class Solution {
    public int[] solve(int A, int[] B) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int[] ans = new int[B.length];
        for(int i=0;i<B.length;i++){
            if(heap.size()< A){
                heap.add(B[i]);
                //  ans[i] = -1;
                if(heap.size() == A){
                    ans[i] = heap.peek();
                }else{
                    ans[i] = -1;
                }
               
            }else{
                if(B[i] > heap.peek()){
                    heap.poll();
                    heap.add(B[i]);
                }
                ans[i] = heap.peek();   
            }

            // if (heap.size() < A) {
            //     ans[i] = -1;
            // } else {
            //     ans[i] = heap.peek();
            // }
           
        }
        return ans;
    }
}
