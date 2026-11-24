class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
       int i=0;
       int j=1;
       int longestSize = 0;
       HashSet<Character> set = new HashSet<>();
       set.add(s.charAt(0));
       while(j < s.length() && i < s.length()){
            char ch = s.charAt(j);
            if(set.contains(ch) ){
                while(set.contains(ch) && i < s.length()){
                   
                    set.remove(s.charAt(i));
                    System.out.println(i);
                    i++;
                }
        
            }else{
                set.add(ch);
                longestSize = Math.max(j-i+1, longestSize);
                j++;
            }
            
       } 
       return longestSize;
    }
}

// a bcabcbb
   
  