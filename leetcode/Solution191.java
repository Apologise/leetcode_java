package com.leetcode;

public class Solution191 {
	//���ַ����ᳬʱ
public static long hammingWeight(int  n) {
		int  k = 0,temp = n;
		//
		while(n%2 != 0){
			k++;
			n = n/2;
        }
		if(n != 0) k++;
		return k;
    }

//����leetcode�ϵ����ϵķ���
public static int  hammingWeight2(int  n){
	int counts = 0;
	while(n != 0){
		counts += n & 1;
		n = n >>1;
	}
	return counts;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution191.hammingWeight2(11));
	}

}
