import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j=0;j<nums.length;j++){
            int brother = target - nums[j];
            if(map.containsKey(brother)){
                int brotherIndex = map.get(brother);
                int[] res= {j, brotherIndex};
                return res;
            }
             map.put(nums[j],j);
        }
        int[] res = {-1,-1};
        return res;
    }
}