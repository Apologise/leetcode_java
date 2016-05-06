package com.leetcode;

public class Solution83 {
	public static ListNode deleteDuplicates(ListNode head){
		if( head == null || head.next == null ) return head;
		head.next = deleteDuplicates(head.next);
		return head.val == head.next.val ? head.next : head;
		
	}
	
	public static ListNode deleteDuplicates2(ListNode head){
		ListNode list = head;
		if( list == null || list.next == null ) return list;
		while( list != null && list.next != null){
			if(list.val == list.next.val) list.next = list.next.next;
			else
				list = list.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
