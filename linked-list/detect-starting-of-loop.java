/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode isCycle = isCyclic(head);
        if(isCycle == null) return null;
        ListNode t1 = isCycle;
        ListNode t2 = head;
        while(t1 != t2){
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }

    public ListNode isCyclic(ListNode head){
        ListNode f = head;
        ListNode s = head;
        while(f!=null && f.next!=null){
            f = f.next.next;
            s = s.next;
            if(f == s){
                return f;
            }
        }
        return null;
    }
}