public class Solution {
    public ArrayList<ArrayList<Integer>> WaysToClimb(int A) {
        ArrayList<ArrayList<Integer>> finalAns = new ArrayList<>();
        generateAllPaths(A, new ArrayList<Integer>(), finalAns);
        return finalAns;
    }


    public void generateAllPaths(int A, ArrayList<Integer> partialPath, ArrayList<ArrayList<Integer>> finalAns){
        if(A == 0){
            //valid ans
            finalAns.add(new ArrayList<Integer>(partialPath));
        }
        if(A<0){
            return; // invalid case
        }
        partialPath.add(1);
        generateAllPaths(A-1, partialPath,finalAns);
        partialPath.remove(partialPath.size()-1);
        partialPath.add(2);
        generateAllPaths(A-2, partialPath, finalAns);
        partialPath.remove(partialPath.size()-1);
    }
}
