class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] <= 0){
                nums[i] = nums.length+2;
            }
        }
        for(int i=0;i<nums.length;i++){
            int ele = Math.abs(nums[i]);
            if(ele > 0 && ele <= nums.length){
                int index = ele -1;
                if(nums[index] > 0){
                    nums[index] = nums[index] * -1;
                }
                
            }
        }
         for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
         }
        for(int i=0;i<nums.length;i++){
            
            if(nums[i] >= 0){
                return i+1;
            }
        }
        return nums.length+1;
    }
}