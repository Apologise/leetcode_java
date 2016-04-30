package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution36 {
	private boolean isParticallyValid(char[][] board, int x1, int y1,int x2,int y2){
		Set borderlist = new HashSet();
		for(int i = x1; i < x2; i++ ){
			for(int j = y1; j < y2; j++){
				if(board[ i ][ j ] != '.' ){
					if(!borderlist.add(board[ i ][ j ])) return false;
				}
			}
		}
		return false;
	}
	
	public boolean isValidSudoku(char[][] board) {
		for(int i = 0; i< 9; i++){
			//对行进行检查
			if(! isParticallyValid(board,i,0,i,8))return false ;
			//对列进行检查
			if( ! isParticallyValid(board,0,i,8,i)) return false ;
			
		}
			//对每个3*3的格子进行检查
			for(int i = 0; i< 3; i++){
				for(int j = 0; j< 3;j++){
					if( !isParticallyValid(board, i*3, j*3, i*3+2, j*3+2 ) )return false ;
				}
			}
			return true;
	}
}
