// Solution to 237. Delete Node in a Linked List
// Problem: https://leetcode.com/problems/delete-node-in-a-linked-list/
// Author: Sumit Gupta

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        
        if(node == null) return;
        
        ListNode p = node;
        
        while(p.next != null) {
            p.val = p.next.val;
            if(p.next.next == null)
                p.next = null;
            else
                p = p.next;
        }
    }
}
