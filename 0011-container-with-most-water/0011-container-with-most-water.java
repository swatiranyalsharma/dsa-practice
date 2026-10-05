class Solution {
    int maxWater = Integer.MIN_VALUE;

    public int maxArea(int[] height) {
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int width = j-i;
        //         int minHeight = Math.min(height[i], height[j]);
        //         int water = width * minHeight;
        //         maxWater = Math.max(water, maxWater);
        //     }
        // }
        // return maxWater;
        // int leftMax = height[0];
        // int rightMax = height[height.length -1];
        int i=0;
        int j= height.length -1;
        while(i<j){
            int width = j-i;
            
            int currHeight = Math.min(height[i], height[j]);
           
            int water = currHeight * width;
            maxWater = Math.max(maxWater, water);
            if(height[i] < height[j]){
                i++;
            }else if(height[i] > height[j]){
                j--;
            }else{
                i++;
                j--;
            }
        }
        return maxWater;
    }
}