package com.lipeng.leetcode;

public class PathSum {

	private int sumForNow = 0;

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}

		sumForNow += root.val;

//		if (sumForNow > sum) {
//			return false;
//		}

		if (sumForNow == sum && root.left == null && root.right == null) {
			return true;
		}

		boolean ret = false;
		if (root.left != null) {
			ret = hasPathSum(root.left, sum);
		}

		if (ret == true) {
			return true;
		}

		if (root.right != null) {
			ret = hasPathSum(root.right, sum);
		}

		if (ret == true) {
			return true;
		}

		sumForNow -= root.val;
		return false;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []arrays = {"1","2"};
		TreeNode root = TreeNode.create(arrays, 0);
		
		PathSum ps = new PathSum();
		System.out.println(ps.hasPathSum(root, 3));

	}

}
