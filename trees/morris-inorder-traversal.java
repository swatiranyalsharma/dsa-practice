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
    public ArrayList<Integer> solve(TreeNode A) {
        TreeNode curr = A;
        ArrayList<Integer> ansArray = new ArrayList<>();
        while(curr != null){
            if(curr.left == null){
                ansArray.add(curr.val);
                curr = curr.right;
            }else{
                TreeNode pre = curr.left;
                while(pre.right !=null && pre.right != curr){
                    pre = pre.right;
                }
                if(pre.right == null){
                    pre.right = curr;
                    curr = curr.left;
                }else{
                    pre.right = null;
                    ansArray.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return ansArray;
    }
}
