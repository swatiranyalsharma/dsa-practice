public class Solution {
    public int evalRPN(String[] A) {
         //push the elements in the stack until operand strikess
        //when operand strikess//pop 2 wlwwmtns perform the operation push it inot the stack again
        Stack<String> s = new Stack<>();
        for(int i=0; i < A.length ; i++){
            if(isOperator(A[i]) == true){
                String first = s.pop();
                String second = s.pop();
                String res = evaluate(second, first, A[i]);
                s.push(res);
            }else{
                s.push(A[i]);
            }
        }
        return Integer.parseInt(s.peek());
    }
    public boolean isOperator(String C){
        if(Arrays.asList("*","+","-","/","%").contains(C)){
            return true;
        }
        return false;
    }
    public String evaluate(String first,String second,String operator){
        int firstVal = Integer.parseInt(first);
        int secondVal = Integer.parseInt(second);
        int res = 0;
        switch(operator){
        case "+":
            res = firstVal + secondVal;
            break;
        case "-":
            res = firstVal - secondVal;
             break;
        case "/":
            res = (int)Math.floor(firstVal / secondVal);
             break;
        case "*":
            res = firstVal * secondVal;
             break;
        case "%":
            res = firstVal % secondVal;
             break;
        }

        return  Integer.toString(res);

    }
}
