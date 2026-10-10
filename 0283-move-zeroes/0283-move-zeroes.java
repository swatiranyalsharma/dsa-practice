class Solution {
    public void moveZeroes(int[] nums) {
        // int i=0;
        // int j= nums.length-1;
        // while(i < j){
            
        // }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}