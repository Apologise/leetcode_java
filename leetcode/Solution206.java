package com.leetcode;

public class Solution206 {
	public ListNode reverseList(ListNode head) {
	   ListNode temp = head;
	   ListNode current = null;
	   ListNode previous = null;
	   while(temp != null){
		   previous = current;
		   current = temp;
		   temp = current.next;
		   current.next = previous;
	   }
	    return current;
	}

	public ListNode reverseList(ListNode head) {
	    /* recursive solution */
	    return reverseListInt(head, null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
