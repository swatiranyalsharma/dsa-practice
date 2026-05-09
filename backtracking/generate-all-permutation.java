public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ansArray = new ArrayList<>();
        generate(A, new ArrayList<Integer>(), ansArray, 0);
        return ansArray;
    }

    public void generate(ArrayList<Integer> A,ArrayList<Integer> partial,ArrayList<ArrayList<Integer>> ansArray, int inc){
        if(partial.size() == A.size()){
            ansArray.add(new ArrayList<Integer>(partial));
            return;
        }

        for(int i=0;i<A.size();i++){
            if(partial.contains(A.get(i))) continue;
            partial.add(A.get(i));
            generate(A, partial, ansArray, inc+1);
            partial.remove(partial.size()-1);
        }

    }
}
