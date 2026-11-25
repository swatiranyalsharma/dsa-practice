class Solution {
    public int longestConsecutive(int[] nums) {
        // int length = 0;
        HashSet<Integer> set = new HashSet<>();
       for(int i=0;i < nums.length;i++){
            set.add(nums[i]);
       }
       int longestLength = 0;
        for(int ele: set){
            int length = 1;
            // int start = ele;
            if(!set.contains(ele - 1)){
                while(set.contains(ele + length)){
                    length++;
                }
            }
            longestLength = Math.max(length, longestLength);
        }
        return longestLength;
    }
}
// [100,4,200,1,3,2]

// set {100,4,200,1,3,2}
