public class Solution {
    public int solve(char[] A) {
        for(int i=0;i<A.length;i++){
            if(alphaNumeric(A[i]) == false){
                return 0;
            }
        }
        return 1;
    }

    public boolean alphaNumeric(char ch){
        if((ch >=65 && ch <= 90) || (ch >= 48 && ch <= 57 ) || (ch >= 97 && ch <= 122 )){
            return true;
        }
        return false;
    }
}
