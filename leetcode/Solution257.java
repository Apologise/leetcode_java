package com.leetcode;

import java.util.*;

public class Solution257 {
	 public List<String> binaryTreePaths(TreeNode root) {
	     List<String> answer  = new ArrayList<String >();   
	     if(root != null) searchHelp(root, "", answer); 
	     return answer;
	    }
	 
	 public void searchHelp(TreeNode root, String path, List<String> answer){
		 if(root.left == null && root.right == null) answer.add(path + root.val);
		 //如果左节点不为空，那么将头结点加入到path中，遍历左子树
		 if(root.left != null) searchHelp(root.left, path + root.val + "->", answer);
		 //如果右节点不为空，俺么将该头结点加入到path中，遍历右子树
		 if(root.right != null) searchHelp(root.right, path + root.val + "->", answer);
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
