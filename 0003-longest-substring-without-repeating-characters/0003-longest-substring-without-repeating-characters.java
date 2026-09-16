class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max = Integer.MIN_VALUE;
        HashSet<Character> setStr = new HashSet<>();
        while(i < s.length()){
            if(setStr.contains(s.charAt(i)) == false){
                setStr.add(s.charAt(i));
                int clength = i- j +1;
                max = Math.max(clength, max);
                i++;
            }else{
                // setStr.add(s.charAt(i));
                while(setStr.contains(s.charAt(i)) != false){
                    setStr.remove(s.charAt(j));
                    j++;
                }
            }
        }
        return max == Integer.MIN_VALUE? 0: max;
    }
}
// ab cabcbb
// 1 R1T7