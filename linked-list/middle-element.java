/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode A) {
    ListNode slowPointer = A;
    ListNode fastPointer = A;
    while(fastPointer.next !=null && fastPointer.next.next!=null){
        slowPointer = slowPointer.next;
        fastPointer = fastPointer.next.next;
    }
    if(fastPointer.next !=null){
        return slowPointer.next.val;
    }
    return slowPointer.val;
    
    }
}
