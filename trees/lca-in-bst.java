/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int solve(TreeNode A, int B, int C) {
        return traversal(A, B, C);
    }

    public int traversal(TreeNode A, int B, int C){
        if(A == null || A.val == -1 ) return A.val;
        if(B > A.val && C > A.val){
            // arr.add(A.val);
            return traversal(A.right, B, C);
            // arr.remove(A.val);
        }else if(B < A.val && C < A.val){
            // arr.add(A.val);
            return traversal(A.left, B, C);
            // arr.remove(A.val);
        }else{
            return A.val;
        }
    }
}
