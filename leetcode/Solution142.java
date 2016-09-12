package com.leetcode;
//https://discuss.leetcode.com/topic/19367/java-o-1-space-solution-with-detailed-explanation/12
public class Solution142 {
	 public ListNode detectCycle(ListNode head) {
		 ListNode slow = head, fast = head;
		 while(fast != null && fast.next != null){
			 fast = fast.next.next;
			 slow = slow.next;
			 //如果slow和fast相等则表示有环，下面找出环开始的节点（此处要用数学知识来了解答）
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
