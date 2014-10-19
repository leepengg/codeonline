package com.lipeng.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {

	private  int sumForNow = 0;

	public boolean hasPathSum(TreeNode root, int sum,  List<List<Integer>> ret, List<Integer> q) {
		if (root == null) {
			return false;
		}

		sumForNow += root.val;
		q.add(root.val);

		if (sumForNow == sum && root.left == null && root.right == null) {
			List<Integer> newQ = new ArrayList<Integer>(q);
			ret.add(newQ);
			sumForNow -= root.val;
			q.remove(q.size()-1);
			return true;
		}

		hasPathSum(root.left, sum, ret, q);

		hasPathSum(root.right, sum, ret, q);

		sumForNow -= root.val;
		q.remove(q.size()-1);
		return false;

	}

	  public List<List<Integer>> pathSum(TreeNode root, int sum) {
		  List<List<Integer>> ret = new ArrayList<List<Integer>>();
		  List<Integer> q = new ArrayList<Integer>();
		  
		  hasPathSum(root, sum, ret, q);
		  
		  return ret;
	        
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []arrays = {"1","2"};
		TreeNode root = TreeNode.create(arrays, 0);
		
		PathSum2 ps = new PathSum2();

	}

}
