/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> delete = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            delete.add(nums[i]);
        }

        ListNode firstNode = new ListNode();
        ListNode newList = firstNode;
        while(head != null){

            if(delete.contains(head.val)){

            }else{
                newList.next = head;
                newList = newList.next;
            }

            head = head.next;
        }
        
        newList.next = null;

        return firstNode.next;
    }
}