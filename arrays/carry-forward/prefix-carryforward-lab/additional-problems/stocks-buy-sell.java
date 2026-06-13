public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        // buy it on 0th and sell it on max profit day
        // [1, 4, 5, 2, 4]
       // got to every element from 1
       // diff with 0th index value
       // and store max value
       int max = 0;
       if(A.length == 0) return 0;
       int buyPrice = A[0];
       for(int i=1;i < A.length; i++){
           if(A[i] < buyPrice){
               buyPrice = A[i];
           }
           max = Math.max(max, A[i] - buyPrice);
       }
       return max;
    }
}
