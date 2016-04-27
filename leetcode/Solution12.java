package com.leetcode;

import java.util.HashMap;

public class Solution12 {
	public static String romanNumber(int num){
		//代表最大为3000
		String M[ ] = {"","M","MM","MMM"};
		//以100为标准，注意900是CM
		String C[ ] = {"","C","CC","CCC","CD","D","DC","DCCC","CM"};
		//以10为标准，40是XL
		String X[ ] = {"","X","XX","XXX","XL"};
		//个，4是IV
		String I[ ] = {"","I","II","III","IV","V"};
		//注意除“/”的优先级比%高
		return M[num/1000]+C[(num%1000)/100]+X[(num%100)/10]+I[num%10];
	}
	
	public static HashMap< Integer , String > map = new HashMap< Integer , String >();
	static{
		map.put(1000,"M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100,"C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
	      map.put(1,"I");
	}
	//通用的解法，用hashmap
	public static String romanNumber2(int num){
			for(Integer i : map.keySet()){
				if( num>= i )
					return map.get(i)+romanNumber2(num-i);
			}
			return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution12.romanNumber(4));
		System.out.println(Solution12.romanNumber2(4));
	}
	}
