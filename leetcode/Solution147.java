package com.leetcode;

public class Solution147 {
	public ListNode insertionSortList(ListNode head){
		if( head == null || head.next == null){
			return head;
		}
		//��ʵ����һ���ڵ㣬Ȼ�����ӵ�ͷ����
		ListNode newHead = new ListNode(0);
		newHead.next = head;
		
		ListNode p = head.next;
		ListNode pre = newHead;
		ListNode r = null;
		head.next = null;
		while( p != null){
			r = p.next;
			pre = newHead;	//preָ���Ѿ�����ĵ�һ���ڵ�
			while( pre.next != null && pre.next.val < p.val){
				pre = pre.next;
			}
			p.next = pre.next;
			pre.next = p;
			p = r;
			}
		return newHead.next;
	} 

}
