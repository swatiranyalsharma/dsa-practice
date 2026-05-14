/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.git 
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        //find middle
        ListNode middleNodeRef = findMiddle(head);
        ListNode refOfNextOfMiddleNode = middleNodeRef.next;
        //disconnect two lists
        middleNodeRef.next = null;
        //reverse second list
        ListNode reversedSecondList = reverseList(refOfNextOfMiddleNode);
        //compare the two lists
        while(head!=null && reversedSecondList !=null){
            if(head.val != reversedSecondList.val){
                return false;
            }
            head = head.next;
            reversedSecondList = reversedSecondList.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head){
        ListNode tmp = head;
        ListNode prev = null;
        ListNode nextElement = tmp;
        while(tmp !=null){
            nextElement = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = nextElement;
        }
        return prev;
    }

    public ListNode findMiddle(ListNode Head){
        ListNode fastPointer = Head;
        ListNode slowPointer = Head;
        while(fastPointer.next !=null && fastPointer.next.next!=null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer;
    }
}