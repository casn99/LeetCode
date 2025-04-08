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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> vals = new HashSet<>();

        if(head == null){
            return false;
        }

        while(head.next != null){
            if(vals.contains(head)){
                return true;
            }else{
                vals.add(head);
            }
            head = head.next;
        }
        return false;
    }
}