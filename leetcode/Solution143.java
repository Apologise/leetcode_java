package com.leetcode;


/*��Ŀ��
 * Given a singly linked list L: L0��L1������Ln-1��Ln,
 * reorder it to: L0��Ln��L1��Ln-1��L2��Ln-2����
 * You must do this in-place without altering the nodes' values.
 * 
 * ˼·��
 * eg: 1-2-3-4-5
 * 1.�ҵ��м�Ľڵ㣺1-2-3-4-5-6
 * 2.���м��Ժ������ת�ã�1-2-3-6-5-4
 * 3.Ȼ����м�Ľڵ㿪ʼ������뵽ͷ���ϣ�1-6-2-5-4
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
	        //1.�ҵ��м�Ľڵ�
		ListNode slow = head;
		ListNode fast = head;
		while( fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
//		ListNode pre = slow;
		ListNode current = slow.next;
		//2. ���м�ڵ��Ժ������ת�ã��������ת���㷨
		ListNode newHead = reverseList(current);
		slow.next = newHead;
		
		
		
		//3.���м��Ժ�Ľڵ���뵽ǰ�������

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
