public class Solution {
    public int solve(String A) {
        //push the sting character into stack until closing bracket arives
        // if closing comes , check if the top leemnts is of its category if not return 1
        // if yes pop , and check for next until string ends
        // now if found paisrs for all the characters, check if stack is empty
        // / if yes , returm 1 else 0
        Stack<Character> s = new Stack<>();
        
        for(int i=0;i < A.length();i++){
            char ch = A.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {   
                s.push(ch);
            } else{
                if(s.isEmpty()){
                    return 0;
                }
                char topElement = s.pop();
                boolean isBalance = isBalance(ch, topElement);
                if(!isBalance){
                    return 0;
                }
            }
        }
        if(s.isEmpty()){
            return 1;
        }
        return 0;
    }
    public boolean isBalance(char currentElement, char topElement){
        //get res as per defined for currentElement
        //top elemtn should be res
        char res = '0';
        switch(currentElement){
            case ']':
                res = '[';
                break;
            case ')':
                res = '(';
                break;
            case '}':
                res = '{';
                break;
        }
        if (topElement == res){
            return true;
        }
        return false;
    }
}
