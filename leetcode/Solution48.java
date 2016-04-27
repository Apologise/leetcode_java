package com.leetcode;

import java.util.Arrays;

public class Solution48 {

	/**
	 * @param args
	 */
	/**
	 * 矩阵转置90
	 * 2种方法
	 * 1.利用(i,j)-->(j,n-1-i)
	 * 2.先交换i,j,再(i,j)-->(i,n-i-1)
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matri ={{1,2,3},{4,5,6},{7,8,9}};
		for(int i = 0;i<matri.length;i++)
			System.out.println(Arrays.toString(matri[i]));
		Solution48.rotate(matri);
		for(int i = 0;i<matri.length;i++)
			System.out.println(Arrays.toString(matri[i]));
	}
	public static void rotate(int[][] matri){
		int n = matri.length;
		int[][] matri1 = new int[n][n];
		for(int i = 0;i<n;i++)
			for(int j = 0;j<n;j++)
				matri1[i][j] = matri[i][j];
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++)
				matri[j][n-1-i] = matri1[i][j];
	}
}
}
