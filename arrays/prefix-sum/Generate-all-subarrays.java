public class Solution {
    public int[][] solve(int[] A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i < A.length; i++){  
            ArrayList<Integer> subArray = new ArrayList<>();
            for(int j = i;j < A.length;j++){
                subArray.add(A[j]);
                ans.add(new ArrayList<>(subArray));
            }
           
        }
        int[][] staticAnsArray = new int[ans.size()][];
        //convert array List into static ArrayList
        for(int r =0; r < ans.size(); r++){
            ArrayList<Integer> row = ans.get(r);
            int[] staticSubArray = new int[ans.get(r).size()];
            for(int k=0;k<ans.get(r).size();k++){
                staticSubArray[k] = row.get(k);
            }
            staticAnsArray[r] = staticSubArray;
        }
        return staticAnsArray;
    }
}
