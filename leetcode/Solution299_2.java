package com.leetcode;

public class Solution299_2 {
	public static String  getHint(String secret, String guess) {
		int bulls = 0, cows = 0;
		int[] result = new int[10];
		if(guess.length() == 0) return null;
		for(int i = 0; i < secret.length(); i++){
			if(secret.charAt(i) == guess.charAt(i)){
				bulls ++;
			}else{
				//如果在secret中出现了该数字，而且该数字频率小于零，则表示在guess中已经出现过，那么表示满足cows的条件
				if(result[secret.charAt(i) - '0'] ++  < 0) { cows++;}
				if(result[guess.charAt(i) - '0'] -- > 0) { cows ++;}
			}
		}
		return bulls + "A" + cows + "B";
    }
	
	public static void main(String[] args){
		System.out.println(Solution299_2.getHint("1807","7810"));
	}
}
