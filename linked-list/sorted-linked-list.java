/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode merged = new ListNode(-1);
        ListNode dummy = merged;
        while(A !=null && B!=null){
            if(A.val< B.val){
                merged.next = A;
                A = A.next;
            }else{
                merged.next = B;
                B = B.next;
            }
            merged = merged.next;
        }
        if(A !=null){
            // while(A.next !=null){
                merged.next = A;
                // A = A.next;
                // merged = merged.next;
            // }
        }
        if(B !=null){
            // while(B.next !=null){
                merged.next =B;
                // B = B.next;
                // merged = merged.next;
            // }
        }
        return dummy.next;
    }
}
