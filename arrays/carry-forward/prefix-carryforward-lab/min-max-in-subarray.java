public class Solution {
    public int solve(int[] A) {
        //Another optimized approach is start with -1 -1 for pos of min and max 
        // iterate over elevry element and ask if this is th epos of min or max
        // if both the pos is not -1, then find the absolute difference to find the length
        // if less than min store in min
        
        //find min
        int min = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            min = Math.min(min, A[i]); // 483
        }
        int max = Integer.MIN_VALUE;
        for(int j=0;j<A.length;j++){
            max = Math.max(max, A[j]); // 981
        }

        int pos_min = -1; // 3
        int pos_max = -1; // 4
        int minLength = A.length;
        for(int k=0;k<A.length; k++){
            if(A[k] == max || A[k] == min){
                if(A[k] == max){
                    pos_max = k;
                }
                if(A[k] == min){
                    pos_min = k;
                }
            }
            if(pos_max !=-1 && pos_min !=-1){
                minLength = Math.min(minLength,(Math.abs(pos_max - pos_min ) + 1));
            }
        }

        return minLength;

    }
}
