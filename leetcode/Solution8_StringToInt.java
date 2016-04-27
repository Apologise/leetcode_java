package com.leetcode;

public class Solution8_StringToInt {
//	public int myAtoi(String str){
//		return Integer.parseInt(str);
	
	/*解法：
	 * 1.遇到空格就跳过（可以直接调用trim函数）
	 * 2.如果输入的是空字符串或者长度为0就返回
	 * 3.如果遇到'+'或'-'就用sign先保存下，+就保存为1，-就保存为-1
	 * 4，如果在遍历字符串的过程中遇到非数字的字符就跳出循环输出前面的数字，后面的不在输出
	 * 		例如：“1234a1234”那么就只返回int类型的1234
	 *5.判断字符是否是在'0'~'9'，是就继续判断，如果当前的字符串转换成int类型（假设为total,这个total是上一次循环所计算的），
	 *		如果a*10大于Integer.MAX_VALUE，表明在本次循环后tatol将大于int所表示的最大值，直接返回
	 *6.例外如果刚好上一次循环的结果tatol刚好等于Integer.MAX_VALUE/10，那么就比较最后一位的大小，如果当前的这一位比7大
	 *	就超出int表示的最大值，同样返回Integer.MAX_VALUE，这里我们也要用到sign,如果为正，返回最大，负就返回最小
	 * */
	public int myAtoi(String str){
		int sign = 1,index = 0, tatol = 0;
		String str1 = str.trim();
		int len = str1.length();
		if(len==0)
			return 0;
		//判断首字符的正负号,注意这里的编程技巧，可以少些一个判断语句
		if(str1.charAt(index)=='+'||str1.charAt(index)=='-'){
			sign = str1.charAt(index)=='+' ? 1 : -1 ;
			index++;
		}
		while(index<len){
			int digit = str1.charAt(index)-'0' ;
			//如果出现数字以外的字符就跳出循环
			if(digit<0||digit>9)
				break;
			if(Integer.MAX_VALUE/10<tatol||Integer.MAX_VALUE/10==tatol&&Integer.MAX_VALUE%10<digit)
				return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
			tatol = tatol*10+digit;
			index++;
		}
		return tatol*sign;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "1234124";
//		Solution8_StringToInt test = new Solution8_StringToInt();
//		System.out.println(test.myAtoi(str));
//		char a = '9';
//		System.out.println(a);
//	
//		System.out.println(a-'0');
//		System.out.println(Integer.MAX_VALUE%10);
		Solution8_StringToInt test = new Solution8_StringToInt();
		String str = "";
		System.out.println(test.myAtoi(str));
		
		
	}

	
}
