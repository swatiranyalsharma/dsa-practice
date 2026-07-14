class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();
        int count = 0;
        int idx =0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!mySet.contains(nums[i])){
                count++;
                nums[idx] = nums[i];
                idx++;
                mySet.add(nums[i]);
            }
        }
        // int[] expectedNums = new int[ans.size()];

        // for(int i=0;i<ans.size();i++){
        //     expectedNums[i] = ans.get(i);
        // }
        return count;
    }
}