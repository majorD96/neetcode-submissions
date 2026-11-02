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
    public void dfs(TreeNode node, List<Integer> result){
        if(node == null){
            result.add(-101);
            return;
        } 
        result.add(node.val);
        dfs(node.left,result);
        dfs(node.right,result);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p ==null && q == null) return true;
        if(p ==null || q == null) return false;
        if(p.val != q.val) return false;
        List<Integer> pList = new ArrayList<>();
        List<Integer> qList = new ArrayList<>();
        dfs(p,pList);
        dfs(q,qList);
        return pList.equals(qList);
    }
}
