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
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null){
            return null;
        }
        
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        ListNode head = null;
        ListNode index = null;
        
        while(l1 !=null && l2!=null){
            if(l1.val < l2.val){
                if(head == null){
                    head = l1;
                    l1 = l1.next;
                    head.next = null;
                    index = head;
                    
                }else{
                    index.next = l1;
                    l1 = l1.next;
                    index = index.next;
                    index.next = null;
                }
            }else{
                if(head == null){
                    head = l2;
                    l2 = l2.next;
                    head.next = null;
                    index = head;
                    
                }else{
                    index.next = l2;
                    l2 = l2.next;
                    index = index.next;
                    index.next = null;
                }
            }
        }
        
        if(l1 == null){
            index.next = l2;
        }else{
            index.next = l1;
        }

    return head;
    }
}
