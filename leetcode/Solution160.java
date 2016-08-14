package com.leetcode;

public class Solution160 {
/*1,�����2������ĳ���
 * 2.����2������ĳ���
 * 3.�ж�2�������Ƿ����
 * ע������Ҫ����һ���������ȵĺ�����������ListNode�ж��壬Ҳ���������Solution�н��
 * */
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);
        ListNode a = headA;
        ListNode b = headB;
        //���2������Ϊ�գ���ô�ͷ��ؿ�
        if( lenA == 0 || lenB ==0) {return null;}
        //���ListA�ĳ��ȴ���ListB
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

//������ĳ���
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
