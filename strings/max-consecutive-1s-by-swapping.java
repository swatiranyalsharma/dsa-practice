/* Length of longest consecutive ones in a binary array if you can swap at most one 0 with a 1.
Given a binary string A. 
It is allowed to do at most one swap between any 0 and 1. 
Find and return the length of the longest consecutive 1’s that can be achieved. 
Constraints
1 <= length of string <= 1000000
A contains only characters 0 and 1.
Return the length of the longest consecutive 1’s that can be achieve.d
Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7
*/

public class Solution {
    public int solve(String A) {
        int longest = 0;
        int isOneExist = 0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i) == '0'){
                int left =i-1;
                int leftCount =0;
                int right =i+1;
                while(left>=0 && A.charAt(left) == '1'){
                    leftCount++;
                    left--;
                }
                int rightCount=0;
                while(right< A.length() && A.charAt(right) == '1'){
                    rightCount++;
                    right++;
                }
                boolean isExtraOneAvailable = false;
                while(left >=0){
                    if(A.charAt(left) == '1'){
                        isExtraOneAvailable = true;
                        break;
                    }
                    left--;
                }
                if(isExtraOneAvailable== false){
                    while(right< A.length()){
                        if( A.charAt(right) =='1'){
                            isExtraOneAvailable = true;
                            break;
                        }
                        right++;
                    }
                }
                 int sum = 0;
                if(isExtraOneAvailable == true){
                    sum= leftCount + rightCount+1;
                }else{
                    sum = leftCount + rightCount;
                }
               
                // sum = sum + 1;
                longest = Math.max(longest, sum);
            }else{
                isOneExist = 1;
            }
        }
        if(longest == 0 && isOneExist == 0) return 0;
        if(longest == 0) return A.length();
        return longest;
    }
}
