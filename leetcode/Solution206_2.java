package com.leetcode;

public class Solution206_2 {
	public ListNode reverseList(ListNode head){
		ListNode temp = head;
		ListNode previous = null;
		ListNode current = null;
		while( temp != null ){
			previous = current;
			current = temp;
			temp = current.next;//ע��temp��ʱ����Ϊ�գ�����current����Ϊ�գ�current = temp���ڸ�����ǰ��
			current.next = previous;
//			previous = current;
//			current = temp;
		}
		return current;//ע�⣬Ҫ����ͷ��㣬���Ǵ�ʱ�µ������ͷ�����β���
	}
}
