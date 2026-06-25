public class Solution {
    public int solve(String A) {
        long counter = 0;
        long total = 0;
        for(int i = A.length()-1; i>=0;i--){
            char ch = A.charAt(i);
            counter++;
            if(isVowel(ch) == true){
                total= ((total % 10003) + (counter % 10003))% 10003;
            }
            
        }
        return (int)total% 10003;
    }

    public boolean isVowel(char ch){
        if(ch == 'A' || ch =='a' || ch == 'E' || ch =='e' || ch == 'I' || ch =='i' || ch == 'O' || ch =='o' || ch == 'u' || ch =='U' ){
            return true;
        }
        return false;
    }
}
