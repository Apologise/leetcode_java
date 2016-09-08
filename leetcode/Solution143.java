package com.leetcode;


/*题目：
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * You must do this in-place without altering the nodes' values.
 * 
 * 思路：
 * eg: 1-2-3-4-5
 * 1.找到中间的节点：1-2-3-4-5-6
 * 2.将中间以后的链表转置：1-2-3-6-5-4
 * 3.然后从中间的节点开始逐个插入到头接上：1-6-2-5-4
 * 
 * */
public class Solution143 {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public class Solution {
	   public void reorderList(ListNode head) {
	       if( head==null||head.next==null)
	       return;
	        //1.找到中间的节点
		ListNode slow = head;
		ListNode fast = head;
		while( fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
//		ListNode pre = slow;
		ListNode current = slow.next;
		//2. 将中间节点以后的链表转置，用链表的转置算法
		ListNode newHead = reverseList(current);
		slow.next = newHead;
		
		
		
		//3.将中间以后的节点插入到前面的链表

		//	temp = p2.next;
//	 	while( temp!=null){
//	 	    	temp = p2.next;
//	 		p2.next = p1.next;
//	 		p1.next = p2;
//	 		p2 = temp;
		
	      ListNode p1=head;
	            ListNode p2= slow.next;
	            ListNode preMiddle = slow;
	            while(p1!=preMiddle){
	                preMiddle.next=p2.next;
	                p2.next=p1.next;
	                p1.next=p2;
	                p1=p2.next;
	                p2=preMiddle.next;
	            }
	    }

	public ListNode reverseList(ListNode head){
	        ListNode newHead = null;
	        while (head != null){
	            ListNode next = head.next;
	            head.next = newHead;
	            newHead = head;
	            head = next;
	        }
	        return newHead;
	    }
	}
}
