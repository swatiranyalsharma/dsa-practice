class Solution {
    public int[] sortArray(int[] nums) {
        buildHeap(nums);
        int j= nums.length-1;
        while(j>=0){
            swap(0, j, nums);
            downHeapify(0, nums, j);
            j--;
        }
        return nums;
    }
    public void buildHeap(int[] nums){
        for(int i= ((nums.length - 2)/2); i>=0;i--){
            downHeapify(i, nums, nums.length);
        }
    }
    public void downHeapify(int i, int[] nums, int length){
        int curr = i;
        while(curr < length){
            int lc = (2 * curr) + 1;
            int rc = (2 * curr) + 2;
            int max = Integer.MIN_VALUE;
            if(lc < length ){
                max = Math.max(nums[lc], nums[curr]);
            }
            
            if(rc < length){
                max = Math.max(nums[rc], max);
            }
            if(rc< length && max == nums[rc] ){
                swap(curr, rc, nums);
                curr = rc;
            }else if( lc < length && max== nums[lc] ){
                swap(curr, lc, nums);
                curr = lc;
            }else{
                break;
            }
        }
    }

    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}