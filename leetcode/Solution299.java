package com.leetcode;


/**
 * 判断数字是否在正确的位置上，secret为“2183”，guess为“3128”
 * 那么1在正确的位置上，其余的三个数字都不在正确的位置上，所以 是1A，3B
 * 注意不在正确的位置的前提是secret中的数字也存在于guess中的位置，所以判定为B
 * 有比如secret为“1234”，guess为“2136”，那么1和2都不在正确的位置上，只有3在正确的位置
 * 而且6只在guess中，但是不在secret中，所以并不算B，最后的输出结果为1A2B
 * 因此我们必须定义一个数组来记录同时出现在secret和guess的数组，记录他们出现的次数
 * 当不相等的时候，如果处于secret位置数的频率+1,而且此时也要判断如果在guess中已经出现了当前secret的
 * 数字,那么此时就是处于不正确的位置，B的值+1，而且还要将secret所处的频率归为初始状态
 * 
 * 将secret和guess位于坐标的原点，先判断其是否小于零，然后secret+1,而guess恰恰相反
 * 
 * 
 * */
public class Solution299 {
	public static String getHint(String secret , String guess){
		int bulls = 0, cows = 0;
		//记录10个数字的频率
		int[] number = new int[10];
		for(int i = 0; i < secret.length(); i++){
			if( secret.charAt(i) == guess.charAt(i)) bulls++;
			else{
				//secret.charAt(i)-'0'将char类型转换成int类型
				if(number[secret.charAt(i)-'0']++ < 0) cows++;
				if(number[guess.charAt(i)-'0']-- >0) cows++;
			}
		}
		return bulls + "A" + cows + "B";
		}
//		int result[] = new int[];d method stub

	public static void main(String[] args) {
		// TODO Auto-generate
		String secret = "1123";
		String guess = "0111";
		System.out.println(Solution299.getHint(secret, guess));
	}
		
}
