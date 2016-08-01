package com.leetcode;

public class Solutio101 {
	public boolean isSymmetric(TreeNode root){
		if( root == null )
			return true;
		return isSymmetricHelp(root.left, root.right);
		}
		
		//������������Ϊ�Ƚϵ���������������ֵ���������ĺ�������һ����㣬
		//������Ҫ���¶���һ������
		public boolean isSymmetricHelp(TreeNode left, TreeNode right){
				if( left == null && right == null) return true;
				if( left == null || right == null ) return false;
				if( left.val == right.val){
					return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(right.left, left.right);
				}else{
					return false;
				}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
