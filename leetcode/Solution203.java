package com.leetcode;

public class Solution203 {
public ListNode removeElements(ListNode head, int val) {
         if( head == null ){return null;}
         ListNode temp = new ListNode(0);
         temp.next = head;
         ListNode p = head;
        ListNode pre =  temp;
         
         while( p != null ){
        	 //����нڵ��ֵ��val���
        	 if( p.val == val ){
        		 p = p.next;
        		 pre.next = p;
        	 }else{
        		 p = p.next;
        		 pre = pre.next;
        	 }
         }
         return temp.next;
    }
}
