package com.leetcode;

public class Soution328 {
public ListNode oddEvenList(ListNode head) {
        if( head != null){
        	ListNode odd = head, even = head.next;
        	ListNode evenHead = even;								//����even��ͷ���
        	while( even != null && even.next != null){		//ע��������even���ж϶�����odd���жϵ�ԭ��
        		odd = odd.next.next;
        		even = even.next.next;
        		odd = odd.next;
        		even = even.next;
        	}
        	odd = evenHead.next;
        }
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
