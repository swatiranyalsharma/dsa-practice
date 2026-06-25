public class Solution {
    public String longestPalindrome(String A) {
        // go to every index and ask if  substring starting from you is longestPalindrome
        // if yes then is it maximum
        int maxSubStringStart = -1;
        int maxSubStringEnd = -1;
        int maxLength = Integer.MIN_VALUE;
        
        for(int i=0;i<A.length();i++){
            int j = i;
            int k= i ;
            while(j >= 0 && k< A.length() && (A.charAt(j) == A.charAt(k))){
                int length = k - j +1;
                if(length > maxLength){
                    maxLength = length;
                    maxSubStringStart = j;
                    maxSubStringEnd = k;
                }
                j--;
                k++;
            }
        }
            
        for(int m=0; m < A.length()-1; m++){
            int s = m;
            int e = m+1;
            while((s>=0 && e<A.length()) && (A.charAt(s) == A.charAt(e) ) ){
                int length = e - s + 1;
                if(length > maxLength){
                    maxSubStringStart = s;
                    maxSubStringEnd = e;
                    maxLength = length;
                }
                s--;
                e++;
            }
        }
        StringBuffer maxSubstring = new StringBuffer();
        if(maxSubStringStart !=-1 && maxSubStringEnd!=-1){
            while(maxSubStringStart <= maxSubStringEnd){
                maxSubstring.append(A.charAt(maxSubStringStart));
                maxSubStringStart++;
            }
        }
        return maxSubstring.toString();
    }


    // aaaabaaa
}
