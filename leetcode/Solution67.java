package com.leetcode;

public class Solution67 {
	 public static  String addBinary(String a, String b) {
		 if( a == null || a.isEmpty() ){
			 return b;
		 }
		 if( b == null || b.isEmpty() ){
			 return a;
		 }
		 
		 char[ ] aArray = a.toCharArray();
		 char[ ] bArray = b.toCharArray();
		 StringBuilder std = new StringBuilder();
		 
		 int i = aArray.length - 1;
		 int j = bArray.length - 1;
		 int flag = 0;
		 while( i > -1 || j> -1 || flag == 1 ){
		 int  aByte = (i > -1) ? Character.getNumericValue( aArray[ i-- ] ) : 0 ;
		 int  bByte = (j > -1) ? Character.getNumericValue( bArray[ j-- ] ) : 0 ;
		 int result = aByte ^ bByte^ flag;
		 flag =  aByte + bByte + flag >=2 ? 1 : 0 ;
		 std.append(result);
		 }
		 
		 return std.reverse().toString();
	    }
	public static void main(String[] args) {
	System.out.println(Solution67.addBinary("1", "1"));
}
}
