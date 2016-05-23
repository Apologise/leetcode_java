package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {
	 public List<Integer> getRow(int rowIndex) {
	        List<Integer> result  = new ArrayList<Integer>();
	        for(int i = 0; i < rowIndex+1; i++){
	        	result.add(0,1);
	        	for(int j = 1; j < result.size()-1; j++){
	        		result.set(j, result.get(j)+result.get(j)+1);
	        	}
	        }
	        return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
