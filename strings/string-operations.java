public class Solution {
    public String solve(String A) {
        String str = concatenate(A);
        String deletedUpperCaseString = delete(str);
        String res = replaceVowelsWithHash(deletedUpperCaseString);
        return res;
    }

    public String concatenate(String A) {
        StringBuffer sb = new StringBuffer();
        sb.append(A);
        sb.append(A);
        return sb.toString();
    }

    public String delete(String A) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            if(Character.isUpperCase(ch) == false){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public String replaceVowelsWithHash(String A) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            if(ch  == 'a' || ch =='e' || ch=='i' || ch == 'o' || ch == 'u'){
                sb.append('#');
            }else{
                 sb.append(ch);
            }
        }
        return sb.toString();
    }
}
