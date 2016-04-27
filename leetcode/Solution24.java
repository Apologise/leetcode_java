package com.leetcode;

public class Solution24 {
	//非递归方法是
	public ListNode swapPairs1(ListNode head){
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode current = dummy;
		while(current.next != null	&&current.next.next != null){
			ListNode first = current.next;
			ListNode second = current.next.next;
			first.next = second.next;
			current.next = second;
			current.next.next = first;
			current = current.next.next;
		}
		return dummy.next;
	}
	//递归方法
	public ListNode swapPairs(ListNode head){
		if(head == null||head.next == null){
			return head;
	}
		ListNode n = head.next;
		head.next = swapPairs1(head.next.next);
		n.next = head;
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
