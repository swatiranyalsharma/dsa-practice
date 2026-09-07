class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        generate(nums, visited, new ArrayList<>());
        return res;
    }
    public void generate(int[] nums,boolean[] visited, ArrayList<Integer> permutation ){
        if(permutation.size() == nums.length){
            res.add(new ArrayList(permutation));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                permutation.add(nums[i]);
                visited[i] = true;
                generate(nums, visited, permutation);
                visited[i] = false;
                permutation.removeLast();
            }
        }
    }
}