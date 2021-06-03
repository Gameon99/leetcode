/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return Symmetric(root.left,root.right);
    }
    
    public boolean Symmetric(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }else if(left == null || right == null){
            return false;
        }
        
        if(left.val != right.val){
            return false;
        }
        
        if(!Symmetric(left.left,right.right)) return false;
        if(!Symmetric(left.right,right.left)) return false;
        
        return true;
    }
    
    
}
