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
    private void level(TreeNode root,int l,List<List<Integer>> arr){
        if (root==null){
            return;
        }
        if(l==arr.size()){
            arr.add(new ArrayList<>());
        }
        arr.get(l).add(root.val);
        level(root.left,l+1,arr);
        level(root.right,l+1,arr);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        level(root,0,arr);
        return arr;
    }
}