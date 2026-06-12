public class Solution {
    public int[] solve(int[] A, int B, int C) {
        int[] subArray = new int[C-B+1];
        int i=0;
        while(B<=C && B<A.length){
            subArray[i] = A[B];
            i++;
            B++;
        }
        return subArray;
    }


}
