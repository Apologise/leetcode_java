package com.leetcode;

public class Solution147 {
	public ListNode insertionSortList(ListNode head){
		if( head == null || head.next == null){
			return head;
		}
		//先实例化一个节点，然后连接到头接上
		ListNode newHead = new ListNode(0);
		newHead.next = head;
		
		ListNode p = head.next;
		ListNode pre = newHead;
		ListNode r = null;
		head.next = null;
		while( p != null){
			r = p.next;
			pre = newHead;	//pre指向已经排序的第一个节点
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
