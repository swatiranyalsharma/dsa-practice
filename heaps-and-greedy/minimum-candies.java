public class Solution {
    public int candy(ArrayList<Integer> A) {
        int[] left = new int[A.size()];
        int[] right = new int[A.size()];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for(int i=1;i<A.size();i++){
            if(A.get(i-1) < A.get(i)){
                left[i] = left[i-1]+1;
            }
        }
        for(int i=A.size()-2;i>=0;i--){
            if(A.get(i) > A.get(i+1)){
                right[i] = right[i+1]+1;
            }
        }
        int minCandies = 0;
        for(int i=0;i<A.size();i++){
            minCandies+= Math.max(left[i], right[i]);
        }
        return minCandies;
    }
}
