package com.leetcode;

public class Solution141 {
	public boolean hasCycle(ListNode head) {  
        // IMPORTANT: Please reset any member data you declared, as  
        // the same Solution instance will be reused for each test case.  
        ListNode slow = head;  
        ListNode fast = head;  
          
        while(fast != null && fast.next != null) {  
            slow = slow.next;  
            fast = fast.next.next;  
            if(slow == fast)  
                return true;  
        }  
        return false;  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
