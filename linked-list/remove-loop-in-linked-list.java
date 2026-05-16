// Remove Loop from Linked List
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        ListNode slowPointer = A;
        ListNode fastPointer = A;
        boolean isCycle = false;
        while(fastPointer!=null && fastPointer.next!=null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(fastPointer == slowPointer){
                isCycle = true;
                break;
            }
        }
        if(isCycle == false){
            return null;
        }
        slowPointer = A;
        ListNode prev = fastPointer;
        while(slowPointer !=fastPointer){
            prev = fastPointer;
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        prev.next = null;
        return A; 
    }
}
