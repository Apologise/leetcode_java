package com.leetcode;
//https://discuss.leetcode.com/topic/19367/java-o-1-space-solution-with-detailed-explanation/12
public class Solution142 {
	 public ListNode detectCycle(ListNode head) {
		 ListNode slow = head, fast = head;
		 while(fast != null && fast.next != null){
			 fast = fast.next.next;
			 slow = slow.next;
			 //���slow��fast������ʾ�л��������ҳ�����ʼ�Ľڵ㣨�˴�Ҫ����ѧ֪ʶ���˽��
			 if( slow == fast){
				 ListNode slow2 = head;
				 while( slow != slow2){
					 slow = slow.next;
					 slow2 = slow2.next;
				 }
				 return slow;
			 }
		 }
		 return null;
	 }
}
