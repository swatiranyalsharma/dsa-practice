/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode A) {
        return mergeSort(A);
    }

    public ListNode mergeSort(ListNode A){
        if(A == null) return A;
        if(A.next == null) return A;
        ListNode middle = findMiddle(A);
        ListNode middleNxt = middle.next;
        middle.next = null;
        ListNode left = mergeSort(A);
        ListNode right = mergeSort(middleNxt);
        return mergeSortedList(left, right);
    }

    public ListNode findMiddle(ListNode A){
        ListNode fast = A;
        ListNode slow = A;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode mergeSortedList(ListNode A, ListNode B){
        if(A == null) return B;
        if(B == null) return A;
        ListNode dummy = new ListNode(-1);
        ListNode nhead = dummy;
        while(A !=null && B!=null){
            if(A.val < B.val){
                dummy.next = A;
                A = A.next;
            }else{
                dummy.next = B;
                B = B.next;
            }
            dummy = dummy.next;
        }
        if(A!=null){
            dummy.next = A;
        }
        if(B !=null){
            dummy.next = B;
        }
        return nhead.next;
    }
}
