package com.leetcode;

public class Solution190 {
	public static int reverseBits(int n) {
	    int result = 0;
	    for (int i = 0; i < 32; i++) {
	        result += n & 1;
	        //无符号右移
	        n >>>= 1;   // CATCH: must do unsigned shift
	        if (i < 31) // CATCH: for last digit, don't shift!
	        	//有符号左移
	            result <<= 1;
	    }
	    return result;
	}
	
	
	private final Map<Byte, Integer> cache = new HashMap<Byte, Integer>();
	public int reverseBits(int n) {
	    byte[] bytes = new byte[4];
	    for (int i = 0; i < 4; i++) // convert int into 4 bytes
	        bytes[i] = (byte)((n >>> 8*i) & 0xFF);
	    int result = 0;
	    for (int i = 0; i < 4; i++) {
	        result += reverseByte(bytes[i]); // reverse per byte
	        if (i < 3)
	            result <<= 8;
	    }
	    return result;
	}
//第二种方法
	private int reverseByte(byte b) {
	    Integer value = cache.get(b); // first look up from cache
	    if (value != null)
	        return value;
	    value = 0;
	    // reverse by bit
	    for (int i = 0; i < 8; i++) {
	        value += ((b >>> i) & 1);
	        if (i < 7)
	            value <<= 1;
	    }
	    cache.put(b, value);
	    return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution190.reverseBits(10));
	}

}
