package problems.leetcode.may;

import problems.leetcode.may.Tree.TreeNode;

/**
 * Kth Smallest Element in a BST

Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Example 1:

Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1


Example 2:

Input: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
Output: 3

Follow up:
What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?


Constraints:

The number of elements of the BST is between 1 to 10^4.
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 * 
 * 
 * 
 * @author ranjit
 *
 */
public class SmallestElementBST {

	public int kthSmallest(TreeNode root, int k) {

		int[] num = new int[2]; // storing int[] with size 2 because [0] >> k, [1] >> value of node 
		
		inorder(root, num, k);
		
		return num[1];
	}

	private void inorder(TreeNode root, int[] num, int k) {
		
		if(root == null)
			return;
		
		inorder(root.left, num, k);
		
//		when recursion end for far left child checking and incrementing parallelly num[0] with ++num[0]   
		if(++num[0] == k) {
			num[1] = root.val;
			return; //kthsmallest found return from here 
		}
		inorder(root.right, num, k);
		
		
	}
	
	public static void main(String[] args) {
		Tree t2 = new Tree(); 
        Integer arr[] = { 5,3,6,2,4,null,null,1}; 
        t2.root = new TreeNode();
        TreeNode root = t2.insertLevelOrder(arr, t2.root, 0);
        System.out.println(new SmallestElementBST().kthSmallest(t2.root,3));
        
	}
	
	
	
	
}


class Tree {
	
	TreeNode root; 
	
	static class TreeNode{
		Integer val;
		TreeNode left;
		TreeNode right;
		
		TreeNode() {
		}
		
		TreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
		
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
		
	}

	public TreeNode insertLevelOrder(Integer[] arr, TreeNode root, int i) {

		if (i < arr.length) {
			if(root == null)
				return root;
			
			TreeNode temp = null;
			if(arr[i] != null)
				temp = new TreeNode(arr[i]);
			
			root = temp;

			root.left = insertLevelOrder(arr, root, i * 2 + 1);
			root.right = insertLevelOrder(arr, root, i * 2 + 2);

		}
		return root;

	}

}
 
 
 
//class Tree {
//	Node root;
//
//	// Tree Node
//	static class Node {
//		int data;
//		Node left, right;
//
//		Node(int data) {
//			this.data = data;
//			this.left = null;
//			this.right = null;
//		}
//	}
//
//	
//}
