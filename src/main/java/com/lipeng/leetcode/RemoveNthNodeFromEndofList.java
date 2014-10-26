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
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        
        ListNode first = head;
        ListNode second = head;
        
        int i = 1;
        while(i <= n){
            first = first.next;
            i++;
        }
        
        if(first == null){
            head = head.next;
            return head;
        }
        
        while(first.next != null){
            first = first.next;
            second = second.next;
        }
            
        second.next = second.next.next;
        
        return head;
    }
}
