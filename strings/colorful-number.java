/** 
 * iven a number A, find if it is COLORFUL number or not.

If number A is a COLORFUL number return 1 else, return 0.

What is a COLORFUL Number:

A number can be broken into different consecutive sequence of digits. 
The number 3245 can be broken into sequences like 3, 2, 4, 5, 32, 24, 45, 324, 245 and 3245. 
This number is a COLORFUL number, since the product of every consecutive sequence of digits is different
 */
public class Solution {
    public int colorful(int A) {
    // go to every substring
    // split and find product
    // check with last prudct if both are same return 0 else after loop return 1
        String str = Integer.toString(A);
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<str.length();i++){
            int currentProduct = 1;
            for(int j=i;j<str.length();j++){
                currentProduct = currentProduct * Character.getNumericValue(str.charAt(j));
              
                if(hs.contains(currentProduct) == true) return 0;
                hs.add(currentProduct);
               
            }
        }
        return 1;
    }

}
