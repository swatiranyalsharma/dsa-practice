public class Solution {
    public int solve(String A) {
       int s =0;
       int e = 2;
       int counter=0;
       while(e<A.length()){
           StringBuffer sb = new StringBuffer();
           for(int i=s;i<=e;i++){
               sb.append(A.charAt(i));
           }
           if(sb.toString().equals("bob")){
               counter++;
           }
           s++;
           e++;
       }
       return counter;
    }

}