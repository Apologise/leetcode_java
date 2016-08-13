package com.leetcode;
/*����2��ָ�룬һ����fast����ָ��n+1��λ�ã�Ȼ��һ��(slow)ָ��headͷ��㣬Ȼ��fast
 * ָ������ĩβ�Ľڵ㣬��ʱslowָ�������Ҫɾ���Ľڵ��ǰһ���ڵ�
 * */
public class Solution19_ {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode start = new ListNode(0);
		ListNode fast = start, slow = start;
		slow.next = head;;
		int i = 1;
		//�Ƚ�fastָ��n+1�Ľڵ�
		while( i <= n+1){
			fast = fast.next;
			i++;
		}
		//slow��fastһ���ܣ�ֱ��fastָ����β�ڵ�
		//ע�⵱���whileѭ�������fast��slow�ڵ����ָ�����ҪŪ���ף���ϸ˼����
		while( fast != null){
			fast = fast.next;
			slow = slow.next;
		}
		//ɾ��slow�����һ���ڵ�
		slow.next = slow.next.next;
		return start.next;
    }
}
