package com.leetcode;

public class Soution328 {
public ListNode oddEvenList(ListNode head) {
        if( head != null){
        	ListNode odd = head, even = head.next;
        	ListNode evenHead = even;								//保留even的头结点
        	while( even != null && even.next != null){		//注意这里用even来判断而不是odd来判断的原因
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
