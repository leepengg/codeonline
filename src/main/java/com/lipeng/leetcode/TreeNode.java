package com.lipeng.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x) { val = x; }
	
	public static TreeNode create(String[] array, int i){
		
		if (array[i].equals("#")) {
			return null;
		}
		
		TreeNode root = new TreeNode(Integer.parseInt(array[i]));
		if((2*i +1) < array.length){
			root.left = create(array, 2*i +1);
		}
		if((2*i +2) < array.length){
			root.right = create(array, (2*i+2));
		} 
		
		return root;
	} 
	
	public static void buildTree(TreeNode root,int data){
            if(data < root.val){
                if(root.left == null){
                	root.left = new TreeNode(data);
                }else{
                    buildTree(root.left,data);
                }
            }else{
                if(root.right == null){
                	root.right = new TreeNode(data);
                }else{
                    buildTree(root.right,data);
                }
            }
    }
}
