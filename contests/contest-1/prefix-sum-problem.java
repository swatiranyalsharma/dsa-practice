/**
 * Samantha is a teacher who is teaching a group of students about divisibility by 7. To make the lesson more interesting, she gives them an array A of size N and asks them Q queries given by B.

In each query, she gives them a range from L to R given by B[i][0] and B[i][1] and asks them to find the count of numbers divisible by 7 in subarray A[L], A[L+1], ... A[R]. Since some students are struggling to solve the problem, Samantha asks for your help to come up with a solution.
 */
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
