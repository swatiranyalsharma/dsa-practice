// 1967. Number of Strings That Appear as Substrings in Word
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        // get all subStrings of wprd
        // go to every patern of patterns and check if it's in the list - use hashSet
        int ans =0;
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i< word.length();i++){
            StringBuffer sb = new StringBuffer();
            for(int j=i;j<word.length();j++){
                sb.append(word.charAt(j));
                hs.add(sb.toString());
            }
        }
        // return hs.size();
        for(int i=0;i<patterns.length;i++){
            if(hs.contains(patterns[i]) == true){
                ans++;
            }
        }
        return ans;
    }
    
}