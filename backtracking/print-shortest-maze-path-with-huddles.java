public class Solution {
    public ArrayList<String> PrintAllPaths(int A, int B) {
        ArrayList<String> ansString = new ArrayList<>();
        generate(A,B,"",1,1, ansString);
        return ansString;
    }

    public void generate(int A,int B, String partial, int idx_a,int idx_b, ArrayList<String> ansString){
        if(idx_a > A || idx_b > B) return;
        if(idx_a == A && idx_b == B){
            ansString.add(partial);
        }
        generate(A, B, partial+"D", idx_a+1, idx_b, ansString);
        generate(A, B, partial+"R", idx_a ,idx_b+1, ansString);
    }
}
