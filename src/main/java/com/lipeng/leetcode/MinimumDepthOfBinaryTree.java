package com.lipeng.leetcode;

public class MinimumDepthOfBinaryTree {
	private int min = Integer.MAX_VALUE;

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}

		sum++;
		if (root.left == null && root.right == null) {
			if (sum < min) {
				min = sum;
			}
			sum--;
			return true;
		}

		hasPathSum(root.left, sum);

		hasPathSum(root.right, sum);

		sum--;
		return false;

	}

	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		hasPathSum(root, 0);
		return min;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
