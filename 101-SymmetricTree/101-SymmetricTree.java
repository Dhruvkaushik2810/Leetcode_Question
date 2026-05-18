// Last updated: 5/18/2026, 12:27:45 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public Boolean ismirror(TreeNode left, TreeNode right){
18        if(left==null && right==null){
19            return true;
20        }
21        
22        if(left==null || right==null){
23            return false;
24        }
25        if(left.val!=right.val){
26            return false;
27        }
28        return ismirror(left.left,right.right)&&ismirror(left.right,right.left);
29        
30    }
31    public boolean isSymmetric(TreeNode root) {
32        if(root==null){
33            return true;
34        }
35        return ismirror(root.left,root.right);
36    }
37}