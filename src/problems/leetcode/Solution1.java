package problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;


public class Solution1 {
	
	Map<Integer, List<Integer>> dfsMap;
	
	
	public static void main(String[] args) {
		
		// binary tree formation  
		TreeNode root = new TreeNode(0);  
	    root.left = new TreeNode(1);  
	    root.left.left = new TreeNode(3);  
	    root.left.left.left = new TreeNode(7);  
	    root.left.right = new TreeNode(4);  
	    root.left.right.left = new TreeNode(8);  
	    root.left.right.right = new TreeNode(9);  
	    root.right = new TreeNode(2);  
	    root.right.left = new TreeNode(5);  
	    root.right.right = new TreeNode(6); 
	    
	    
	    Vector<Integer> path1 = new Vector<>();
	    Vector<Integer> path2 = new Vector<>();
	    //getDistance(root, path1, 7);
	    getDistance(root, path2, 8);
	    
	    for(Integer v : path1) {
	    	System.out.println("path1> "+ v);
	    }
		
	    for(Integer v : path2) {
	    	System.out.println("path2> "+ v);
	    }
		
	}


	private static boolean getDistance(TreeNode root, Vector<Integer> path, int i) {
		if(root == null) {
			return false;
		}
		
		path.add(root.val);
		
		if(root.val == i) {
			return true;
		}
		
		
		
		if(getDistance(root.left, path, i) || getDistance(root.right, path, i)) {
			System.out.println("return from :" + root.left.val + "return to :"+ root.val);
			return true;
		}
		
		path.remove(path.size()-1);
		return false;
		
	}


	public List<List<Integer>> levelOrder(TreeNode root) {
		dfsMap = new HashMap<>();
		dfs(root, 0);

		List<List<Integer>> list = new ArrayList<>();

		for (List<Integer> val : dfsMap.values()) {
			list.add(val);
		}

		return list;
	}

	public void dfs(TreeNode node, int depth) {

		if (node == null) {
			return;
		}
		depth++;
		dfs(node.left, depth);

		if (dfsMap.containsKey(depth)) {
			List<Integer> inline = dfsMap.get(depth);
			inline.add(node.val);
			dfsMap.put(depth, inline);
		} else {
			List<Integer> inline = new ArrayList<>();
			inline.add(node.val);
			dfsMap.put(depth, inline);
		}

		dfs(node.right, depth);

	}

	
	

}
