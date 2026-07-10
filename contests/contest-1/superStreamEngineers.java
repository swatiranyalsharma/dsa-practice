/**
 * You've just been hired as a network engineer at SuperStream, a leading video streaming service. One of your first tasks is to optimize the number of video data packets sent to users based on their internet connectivity.

When a user hits "play," video data is transmitted in packets. If their device acknowledges these packets quickly, it means they have a strong connection and can receive more packets simultaneously for smoother streaming. If acknowledgments lag, fewer packets should be sent to prevent buffering.

Given an array A, where each entry represents the acknowledgment time (in milliseconds) for individual packets, and two integers B and C, can you determine if there's a continuous sequence of B packets with an average acknowledgment time less than or equal to C milliseconds? If so, it's a green signal (integer 1) to send more packets. Otherwise, it's time to throttle back (integer 0).

Note: For average, take the floor of (sum/total number of elements).


Problem Constraints

1 <= N <= 105

1 <= A[i] <= 109

1 <= B <= N

1 <= C <= 109

Input 1:


A = [30, 25, 40, 35, 20, 45, 50, 55, 22, 18, 15], 
B = 3, 
C = 30

Output 1:
1
 */

public class Solution {
    public int solve(int[] A, int B, int C) {
        //sliding throught the array of window size B
        //if avg of window is less than C return 1
        int s = 0;
        int e = B-1;
        while(e < A.length){
            int sum = 0;
            for(int i=s;i<=e;i++){
                sum +=A[i];
            }
            double avg = Math.floor(sum / B);
            if(avg<=C) return 1;
            s++;
            e++;
        }
        return 0;
    }
}
