package com.leetcode;

public class Solution148 {
public ListNode sortList(ListNode head) {
		//�ȴ���һ��ͷ���
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode pre = temp;
		ListNode p = head;
		ListNode r = p.next;
		p.next = null;
		while(){
			p = r;
			pre = temp;//ÿ�αȽ϶��Ǵӵ�һ����㿪ʼ�Ƚϣ�����preָ������ָ��ĵ�һ���ڵ��ǰһ���ڵ�
			while(pre.next != null && pre.next.val < p.val){			
				/*���pre����Ľڵ��ֵС��p�ڵ㣬��ô�������±Ƚ�
				 * ˼����Ϊʲô�޶���������pre.next != null ,������pre.next != p,��ϸ˼�����е�ԭ��
				 */
				pre = pre.next;
			}
			//�ҵ���һ�����������Ľڵ㣬������뵽pre�ĺ���
			r = p.next;
			p.next = pre.next;
			pre.next = p;
		}
    }
}
