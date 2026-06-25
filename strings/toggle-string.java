public class Solution {
    public String solve(String A) {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<A.length();i++){
            char ch = A.charAt(i);
            if(Character.isLowerCase(ch) == true){
                char toggle = Character.toUpperCase(ch);
                sb.append(toggle);
            }else{
                char toggle = Character.toLowerCase(ch);
                sb.append(toggle);
            }
        }
        return sb.toString();
    }
}
