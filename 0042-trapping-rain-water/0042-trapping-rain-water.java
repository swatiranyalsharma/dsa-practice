class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        getLeftMax(height, leftMax);
        getRightMax(height, rightMax);
        int sum =0;
        for(int i=1;i<height.length-1;i++){
            int curr = Math.min(leftMax[i], rightMax[i]) - height[i];
            if(curr>0){
                sum+=curr;
            }
        }
        return sum;
    }

    public void getLeftMax(int[] height, int[] leftMax){
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
    }
      public void getRightMax(int[] height, int[] rightMax){
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
    }
}