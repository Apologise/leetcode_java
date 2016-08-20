package com.leetcode;
/*
// * 思路：现将end指针指向LinkList的尾节点，然后和start节点一次比较===这个思路是错误的，因为指针不能往后移动
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
////		 	//将end节点指向尾节点
////		 	while(end.next != null){
////		 		 end = end.next;
////		 	}
////		 	while( end != start ){
////		 		if( end.val != start.val ) { return false}
////		 		end--；
////		 		start++;
////		 	}
//		 
///*
// * 正确的思路是：
// * 1.找到LinkList的中间节点，分为2个部分。
// * 2.然后将后半部分的链表逆转
// * 3.然后前半部分的链表和后半部分的链表一次比较每个节点的值
// * */
		 //1.找到链表的中间节点，正确的思路是定义一个slow和fast指针，slow的速度是1,fast速度是2，要注意细节！！！
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		//将slow后移一位，使slow指向后半部分的开始节点
		 
		 
		 //2.将后半部分的LinkList逆转
		 ListNode p2 = reverseList(head) ;
		 ListNode p1 = head;
		 
		 //3.将p1和p2这两个指针一次比较
		 while(p2 != null){
			 if( p1.val != p2.val){
				 return false;
			 }
			 p1 = p1.next;
			 p2 = p2.next;
		 }
		 return true;//这里需要考虑是否恢复原来的链表？
	    }
	 //将链表逆转
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
