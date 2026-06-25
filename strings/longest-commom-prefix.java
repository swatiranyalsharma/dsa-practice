public class Solution {
    public String longestCommonPrefix(String[] A) {
        if(A.length == 1){
            return A[0];
        }
        int prefixPointer = Integer.MAX_VALUE;
        for(int i=0;i<A.length -1;i++){
            String s1 = A[i];
            String s2 = A[i+1];
            int p1 =0;
            int p2 =0;
            
            while(p1 < s1.length() && p2 < s2.length() && s1.charAt(p1) == s2.charAt(p2)){
                p1++;
                p2++;
            }
            int currentPointer = (p1 == 0 ? -1 : p1);
            prefixPointer = Math.min(currentPointer, prefixPointer);
        }
        StringBuffer sb = new StringBuffer();
        for(int k=0;k<prefixPointer;k++){
            sb.append(A[0].charAt(k));
        }
        return sb.toString();
    }
    
}
