/**
 * Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
 */
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1Set = new HashSet<>();
        int minCommonVal = Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            nums1Set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(nums1Set.contains(nums2[j])){
                minCommonVal = Math.min(minCommonVal, nums2[j]);
            }
        }
        if(minCommonVal == Integer.MAX_VALUE){
            return -1;
        }
        return minCommonVal;
    }
}