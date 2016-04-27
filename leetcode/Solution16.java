package com.leetcode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solution16 {
	public static  List< String > letterCombinations ( String numbers ){
		LinkedList< String > list = new LinkedList< String >();
		String [ ]  mapping =new String [ ] {"0","1","abc","def","ghi","jkl","mno","pqrs"};
		list.add("");
		for( int i  = 0; i< numbers.length(); i++){
			int x = Character.getNumericValue(numbers.charAt(i));
			while(  list.peek().length() == i){
				String s = list.remove();
				for(char element: mapping[x].toCharArray())
					list.add(s+element);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterator< String > it= Solution16.letterCombinations("23").iterator();
		while(it.hasNext()){
			String str =  it.next();
			System.out.println(str);
		}
		
	}

}
