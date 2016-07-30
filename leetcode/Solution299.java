package com.leetcode;


/**
 * �ж������Ƿ�����ȷ��λ���ϣ�secretΪ��2183����guessΪ��3128��
 * ��ô1����ȷ��λ���ϣ�������������ֶ�������ȷ��λ���ϣ����� ��1A��3B
 * ע�ⲻ����ȷ��λ�õ�ǰ����secret�е�����Ҳ������guess�е�λ�ã������ж�ΪB
 * �б���secretΪ��1234����guessΪ��2136������ô1��2��������ȷ��λ���ϣ�ֻ��3����ȷ��λ��
 * ����6ֻ��guess�У����ǲ���secret�У����Բ�����B������������Ϊ1A2B
 * ������Ǳ��붨��һ����������¼ͬʱ������secret��guess�����飬��¼���ǳ��ֵĴ���
 * ������ȵ�ʱ���������secretλ������Ƶ��+1,���Ҵ�ʱҲҪ�ж������guess���Ѿ������˵�ǰsecret��
 * ����,��ô��ʱ���Ǵ��ڲ���ȷ��λ�ã�B��ֵ+1�����һ�Ҫ��secret������Ƶ�ʹ�Ϊ��ʼ״̬
 * 
 * ��secret��guessλ�������ԭ�㣬���ж����Ƿ�С���㣬Ȼ��secret+1,��guessǡǡ�෴
 * 
 * 
 * */
public class Solution299 {
	public static String getHint(String secret , String guess){
		int bulls = 0, cows = 0;
		//��¼10�����ֵ�Ƶ��
		int[] number = new int[10];
		for(int i = 0; i < secret.length(); i++){
			if( secret.charAt(i) == guess.charAt(i)) bulls++;
			else{
				//secret.charAt(i)-'0'��char����ת����int����
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
