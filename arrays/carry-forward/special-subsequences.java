public class Solution {
    public long solve(String A) {
        int countOfG = 0;
        long pairs = 0;
        for(int i=A.length()-1;i>=0;i--){
            char ch = A.charAt(i);
            if(ch == 'G'){
                countOfG = countOfG + 1;
            }
            if(ch == 'A'){
                pairs = pairs + countOfG;
            }
        }
        return pairs; 
    }
}
