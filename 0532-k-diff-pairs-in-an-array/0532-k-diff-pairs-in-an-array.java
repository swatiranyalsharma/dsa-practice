class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        for(int key: map.keySet()){
            int brother = key + k;
            if(map.containsKey(brother) && map.get(brother)> 0){
                if(k == 0){
                    if(map.get(brother)> 1) count++;
                }else{
                    count++;
                }
            }
        }
        return count;
    }
}