package com.leetcode;
/*设置2个指针，一个（fast）先指向n+1的位置，然后一个(slow)指向head头结点，然后当fast
 * 指向了最末尾的节点，此时slow指向的我们要删除的节点的前一个节点
 * */
public class Solution19_ {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode start = new ListNode(0);
		ListNode fast = start, slow = start;
		slow.next = head;;
		int i = 1;
		//先将fast指向n+1的节点
		while( i <= n+1){
			fast = fast.next;
			i++;
		}
		//slow和fast一起跑，直到fast指向了尾节点
		//注意当这个while循环跑完后fast和slow节点具体指向哪里，要弄明白（仔细思考）
		while( fast != null){
			fast = fast.next;
			slow = slow.next;
		}
		//删除slow后面的一个节点
		slow.next = slow.next.next;
		return start.next;
    }
}
