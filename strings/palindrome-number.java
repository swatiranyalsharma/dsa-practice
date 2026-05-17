class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        // String[] arr = str.split("");
        //s at the starting
        //e at the end
        // move and compare until middle
        // if not same then return false 
        //at the end return true
        int s= 0;
        int e = str.length()-1;
        int middle = (s + e)/2;
        while(s <= middle && e > middle){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
        
    }
}