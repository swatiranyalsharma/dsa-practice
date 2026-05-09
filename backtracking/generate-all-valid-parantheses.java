public class Solution {
    public String[] generateParenthesis(int A) {
        ArrayList<String> ansList = new ArrayList<>();
        generate(A, "", 0,0,ansList);
        String[] ansStr = new String[ansList.size()];
        for(int i=0;i<ansList.size();i++){
            ansStr[i] = ansList.get(i);
        }
        return ansStr;
    }

    public void generate(int A,String str,int open,int closed, ArrayList<String> ansList){
        if(closed > open || open > A){
            return;
        }
        if(str.length() == 2* A){
            if(open == closed){
                ansList.add(str);
            }
            return;
        }
        generate(A, str+"(", open+1, closed, ansList);
        generate(A, str+")", open, closed+1, ansList);
    }
}
