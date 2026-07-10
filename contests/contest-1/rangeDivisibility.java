public class Solution {
    public int[] solve(int[] A, int[][] B) {
        int[] prefix = new int[A.length];
        findPrefix(A,prefix);
        int[] ans = new int[B.length];
        for(int i=0; i<B.length ; i++){
            int l = B[i][0];
            int r = B[i][1];
            int sum =0;
            if(l == 0){
                sum = prefix[r];
            }else {
                sum = prefix[r] - prefix[l-1];
            }
            ans[i] = sum;
        }
        return ans;
    }
    public void findPrefix(int[] A,int[] prefix){
        if(A[0] % 7 == 0){
             prefix[0] = 1;
        }else{
             prefix[0] = 0;
        }
       
        for(int i=1;i<A.length;i++){
            if(A[i] % 7 == 0){
                 prefix[i] = prefix[i-1]+ 1;
            }else{
                 prefix[i] = prefix[i-1];
            }
           
        }
    }
}
