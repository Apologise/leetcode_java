package com.leetcode;

public class Solution21_2 {
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode mergeHead;
        if(l1.val < l2.val){
        	mergeHead = l1;
        	mergeHead.next = mergeTwoLists(mergeHead.next, l2);
        }else{
        	mergeHead = l2;
        	mergeHead.next = mergeTwoLists(mergeHead.next, l1);
        }
        return mergeHead;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
