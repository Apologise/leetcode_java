package com.leetcode;

public class Solution148 {
public ListNode sortList(ListNode head) {
		//先创建一个头结点
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode pre = temp;
		ListNode p = head;
		ListNode r = p.next;
		p.next = null;
		while(){
			p = r;
			pre = temp;//每次比较都是从第一个结点开始比较，所以pre指针总是指向的第一个节点的前一个节点
			while(pre.next != null && pre.next.val < p.val){			
				/*如果pre后面的节点的值小于p节点，那么继续往下比较
				 * 思考：为什么限定的条件是pre.next != null ,而不是pre.next != p,仔细思考其中的原因
				 */
				pre = pre.next;
			}
			//找到了一个符合条件的节点，将其插入到pre的后面
			r = p.next;
			p.next = pre.next;
			pre.next = p;
		}
    }
}
