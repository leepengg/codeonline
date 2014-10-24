package com.lipeng.leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode pre = head;
        ListNode node = head;
        
        while(node !=null && node.next != null){
            pre = node;
            node = node.next;
            while(node != null && pre.val == node.val){
                pre.next = node.next;
                node = node.next;
            }
        }
        
        return head;
        
    }
}
