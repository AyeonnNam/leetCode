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
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && root.val !=val ) {
    		
    		 if(val <root.val) {
    			
    			root =  root.left;
    			
    			
    		}
    		else if(val > root.val) {
    			root = root.right;
    		}
    		
    		

    	}
    	return root;
    }
}