package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
	public List<List<Integer>> generate(int numRows)
	{
	    List<List<Integer>> allrows = new ArrayList<List<Integer>>();
	    ArrayList<Integer> row = new ArrayList<Integer>();
	    for(int i=0;i<numRows;i++)
	    {
	        row.add(0, 1);
	        for(int j=1;j<row.size()-1;j++)
	            row.set(j, row.get(j)+row.get(j+1));
	        allrows.add(new ArrayList<Integer>(row));
	    }
	    return allrows;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0,1);
		list.add(0,1);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		list.add(1,3);
		System.out.println(2);
		
		
	}

}
