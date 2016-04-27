package com.leetcode;


class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
	}
	
	public static void Print(ListNode head){
		for(;head != null;head = head.next)
			System.out.println(head.val);
	}
}
public class Solution19 {
	public static ListNode                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 removeNthFormEnd(ListNode head , int n){
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode fast = dummy;
		ListNode slow = dummy;
		int temp = n;
		for(;fast.next != null;temp--){
			if(temp <= 0){
				slow = slow.next;
			}
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return dummy.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(0);
		head.next.val = 1;
		head.next.next.val = 2;
		head.next.next.next.val = 3;
		head.next.next.next.next = null;
		ListNode.Print(head);
		
		
	}

}
