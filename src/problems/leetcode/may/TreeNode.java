package problems.leetcode.may;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public static void main(String[] args) {
		SolutionPreeOrderToBST obj = new SolutionPreeOrderToBST();
		obj.bstFromPreorder(new int[] {4,2});
	}
	
	
}




class SolutionPreeOrderToBST {
	public int pIndex = 0;
	
    public TreeNode bstFromPreorder(int[] preorder) {
    	
    	if(preorder.length <= 0) return null;
    	
    	
//    	if(preorder.length == 2) {
//    		
//    		
//    		TreeNode root = new TreeNode(preorder[0]);
//    		if(preorder[1] > preorder[0])
//    			root.right = new TreeNode(preorder[1]);
//    		else
//    			root.left = new TreeNode(preorder[1]);
//    	}
    	
       TreeNode root = constructTree(preorder, pIndex, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return root; 
    }

    public TreeNode constructTree(int[] preorder, int pIndex, int min, int max) {
    	
    	
    	
    	
		if (pIndex < preorder.length) {
			int data = preorder[pIndex];
			
			if (preorder[pIndex] > min && preorder[pIndex] < max) {
				TreeNode root = new TreeNode(preorder[pIndex]);
//				pIndex++;
				if (pIndex < preorder.length) {
					// nodes lies between min and data will create left subtree
					root.left = constructTree(preorder, pIndex+1, min,
							data);
					// nodes lies between data and max will create right subtree
					root.right = constructTree(preorder, pIndex+1,
							data, max);
				}
				return root;
			}
		}
		return null;
	}
	
	
	
	
}
