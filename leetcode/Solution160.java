package com.leetcode;

public class Solution160 {
/*1,先求出2个链表的长度
 * 2.对齐2个链表的长度
 * 3.判断2个链表是否相等
 * 注意这里要定义一个求链表长度的函数，可以在ListNode中定义，也可以在这个Solution中解决
 * */
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);
        ListNode a = headA;
        ListNode b = headB;
        //如果2个链表都为空，那么就返回空
        if( lenA == 0 || lenB ==0) {return null;}
        //如果ListA的长度大于ListB
        while( lenA > lenB){
        	a = a.next;
        	lenA --;
        }
        
        while( lenA < lenB){
        	b = b.next;
        	lenB--;
        }
        
        while( a != b){
        	a = a.next;
        	b = b.next;
        }
        
        return a;
    }

//求链表的长度
	public int length( ListNode head){
		int len = 0;
		ListNode p = head;
		while( p != null){
			p = p.next;
			len++;
		}
		return len;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
