/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeKLists(ArrayList<ListNode> a) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((x, y) -> x.val - y.val);
        for(int i=0;i<a.size();i++){
            if(a.get!=null){
                 pq.add(a.get(i));
            }
           
        }
        ListNode dummy = new ListNode(-1);
        ListNode tmp = dummy;
        while(pq.size()>0){
            ListNode minNode = pq.poll();
            tmp.next = minNode;
            tmp = tmp.next;
            if(minNode.next !=null){
                pq.add(minNode.next);
            }
        }
        return dummy.next;
	}
}
