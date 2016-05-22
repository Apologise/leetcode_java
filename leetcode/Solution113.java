package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution113 {
	public List<List<Integer>> resultlist = new ArrayList<List<Integer>>(); 
	public void pathSumInner(TreeNode root, int sum, Stack<Integer> path){
		path.push(root.val);
		if( root.val == null && root.right == null ){
			if( sum == root.val ) resultlist.add(new ArrayList<Integer>(path));
			if( root.left != null ) pathSumInner(root.left, sum - root.val, path);
			if( root.right != null ) pathSumInner(root.right, sum-root.val, path);
			path.pop();
		}
	}
	
	public List<List<Integer>> pathSum(TreeNode root, int sum){
		if(root==null) return resultlist;
		Stack<Integer> path = new Stack<Integer>();
		pathSumInner(root,sum,path);
		return resultlist;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
