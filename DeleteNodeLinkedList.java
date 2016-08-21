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
        
        if(node == null)
            return;
        
        ListNode present = node;
        while(present.next != null) {
            present.val = present.next.val;
            if(present.next.next == null)
                present.next = null;
            else
                present = present.next;
        }
    }
}
