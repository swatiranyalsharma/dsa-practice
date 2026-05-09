class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        // code here
        ArrayList<ArrayList<Integer>> ansSubsequence = new ArrayList<>();
        generate(A, 0,ansSubsequence, new ArrayList<>());
        return ansSubsequence;
    }

    public void generate(ArrayList<Integer> A, int i, ArrayList<ArrayList<Integer>> ansSubsequence, ArrayList<Integer> curent){
        if(i == A.size()){
            ansSubsequence.add(curent);
            return;
        }
        curent.add(A.get(i));
        generate(A, i+1, ansSubsequence,new ArrayList<>(curent));
        curent.remove(Integer.valueOf(A.get(i)));
        generate(A, i+1, ansSubsequence,new ArrayList<>(curent));
    }
}