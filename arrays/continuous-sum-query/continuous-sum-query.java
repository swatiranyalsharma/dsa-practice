public class Solution {
    public int[] solve(int A, int[][] B) {
        int[] arr = new int[A];
        Arrays.fill(arr, 0);
        for(int k =0;k < B.length;k++){
            int i = B[k][0];
            int j= B[k][1];
            int x = B[k][2];
            arr[i-1] +=x;
            if(j<A){
                arr[j]+=(-x); 
            }
        }
        for(int i=1;i<A;i++){
            arr[i] = arr[i-1]+ arr[i];
        }
        return arr;
    }
}
