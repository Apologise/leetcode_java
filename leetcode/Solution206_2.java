package com.leetcode;

public class Solution206_2 {
	public ListNode reverseList(ListNode head){
		ListNode temp = head;
		ListNode previous = null;
		ListNode current = null;
		while( temp != null ){
			previous = current;
			current = temp;
			temp = current.next;//注意temp此时可能为空，但是current不能为空，current = temp因在该语句的前面
			current.next = previous;
//			previous = current;
//			current = temp;
		}
		return current;//注意，要返回头结点，但是此时新的链表的头结点是尾结点
	}
}
