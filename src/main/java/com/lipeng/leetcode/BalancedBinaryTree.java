package com.lipeng.leetcode;

public class BalancedBinaryTree {
	private int min = Integer.MAX_VALUE;
	private int max = Integer.MIN_VALUE;
	
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}

		sum++;
		if (root.left == null && root.right == null) {
			if (sum < min) {
				min = sum;
			}
			if(sum > max){
				max = sum;
			}
			sum--;
			return true;
		}

		hasPathSum(root.left, sum);

		hasPathSum(root.right, sum);

		sum--;
		return false;

	}
	
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		if(root.left == null || root.right == null){
			min = 1;
		}
		
		hasPathSum(root, 0);
		return max-min > 1 ? false : true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
