package com.leetcode;
/*
// * ˼·���ֽ�endָ��ָ��LinkList��β�ڵ㣬Ȼ���start�ڵ�һ�αȽ�===���˼·�Ǵ���ģ���Ϊָ�벻�������ƶ�
 * */

public class Solution234 {
    public boolean isPalindrome(ListNode head) {
//		 ListNode p=head;
//		 ListNode q=head;
//		 int i=0,k=-1;
//		 while(p!=null)
//		 {
//			 p=p.next;
//			 k++;
//		 }
//		 if(k%2==0) i=k/2;
//		 else i=k/2-1;
//		 if(i<0) return true; 
//		 while(i>0)
//		 {
//			 q=q.next;
//			 i--;
//		 }
//		 if(k%2==1) p=q.next;
//		 else p=q.next.next;
//		 ListNode rp=head,rq=q,c;
//		 while(rp!=rq)
//		 {
//		     c=rp.next;
//			 rp.next=rq.next;
//			 rq.next=rp;
//			 rp=c;
//		 }
//		 while(p!=null)
//		 {
//			 if(p.val!=rq.val) return false;
//			 else
//			 {
//				 p=p.next;
//				 rq=rq.next;
//			 }
//		 }
//		 return true;
//	 }
//}
////		 	ListNode start = head;
////		 	ListNode end = head;
////		 	//��end�ڵ�ָ��β�ڵ�
////		 	while(end.next != null){
////		 		 end = end.next;
////		 	}
////		 	while( end != start ){
////		 		if( end.val != start.val ) { return false}
////		 		end--��
////		 		start++;
////		 	}
//		 
///*
// * ��ȷ��˼·�ǣ�
// * 1.�ҵ�LinkList���м�ڵ㣬��Ϊ2�����֡�
// * 2.Ȼ�󽫺�벿�ֵ�������ת
// * 3.Ȼ��ǰ�벿�ֵ�����ͺ�벿�ֵ�����һ�αȽ�ÿ���ڵ��ֵ
// * */
		 //1.�ҵ�������м�ڵ㣬��ȷ��˼·�Ƕ���һ��slow��fastָ�룬slow���ٶ���1,fast�ٶ���2��Ҫע��ϸ�ڣ�����
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		//��slow����һλ��ʹslowָ���벿�ֵĿ�ʼ�ڵ�
		 
		 
		 //2.����벿�ֵ�LinkList��ת
		 ListNode p2 = reverseList(head) ;
		 ListNode p1 = head;
		 
		 //3.��p1��p2������ָ��һ�αȽ�
		 while(p2 != null){
			 if( p1.val != p2.val){
				 return false;
			 }
			 p1 = p1.next;
			 p2 = p2.next;
		 }
		 return true;//������Ҫ�����Ƿ�ָ�ԭ��������
	    }
	 //��������ת
	    private ListNode reverseList(ListNode head) {
	    	if(head == null || head.next == null)
	    		return head;
	    	ListNode pre = null;
	    	ListNode cur = head;
	    	while(cur != null) {
	    		ListNode next = cur.next;
	    		cur.next = pre;
	    		pre = cur;
	    		cur = next;			
	    	}
	    	return pre;
	    }
	    
}
