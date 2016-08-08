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
		 //�����ڵ㲻Ϊ�գ���ô��ͷ�����뵽path�У�����������
		 if(root.left != null) searchHelp(root.left, path + root.val + "->", answer);
		 //����ҽڵ㲻Ϊ�գ���ô����ͷ�����뵽path�У�����������
		 if(root.right != null) searchHelp(root.right, path + root.val + "->", answer);
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
