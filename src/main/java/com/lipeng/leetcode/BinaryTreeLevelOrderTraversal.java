package com.lipeng.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryTreeLevelOrderTraversal {
	private int depth = 0;
	
	private void trave(TreeNode root, Map<Integer, List<Integer>> result){
		depth++;
		
		List<Integer> list = result.get(depth);
		if(list == null){
			list = new ArrayList<Integer>();
			result.put(depth, list);
		}
		list.add(root.val);
		
		if(root.left != null){
			trave(root.left, result);
		}
		if(root.right != null){
			trave(root.right, result);
		}
		
		depth--;
		
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		Map<Integer, List<Integer>> result = new HashMap<Integer, List<Integer>>();
		
		if(root == null){
			return new ArrayList<List<Integer>>();
		}
		
		trave(root, result);
		
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		
		int size = result.size();
		for(int i = 1; i<=size; i++){
			ret.add(result.get(i));
		}
		
		return ret;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
