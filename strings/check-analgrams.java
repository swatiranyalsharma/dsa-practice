/*You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.

Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.*/
public class Solution {
    public int solve(String A, String B) {
        if(A.length() != B.length()) return 0;
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<B.length();i++){
           char ch = B.charAt(i);
           if(map.containsKey(ch) == false){
               return 0;
           }
           map.put(ch, map.getOrDefault(ch, 0)-1);
        }
        for(int occu: map.values()){
            if(occu !=0) return 0;
        }
        return 1;
    }
}
