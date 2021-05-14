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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();

        ListNode node1 = l1;
        ListNode node2 = l2;

        int carry = 0;
        int value = 0;
        
        
        while(node1 != null || node2 != null){
            value = 0;
            if(node1 != null){
                value = value + node1.val;
                node1 = node1.next;
            }
            if(node2 != null){
                value = value + node2.val;
                node2 = node2.next;
            }
            value = value + carry;
            if(value >= 10){
                value = value % 10;
                carry = 1;
                insert(result, value);
            }else{
                insert(result, value);
                carry = 0;
            }
        }
        if(carry == 1){
            insert(result,1);
        }
        return result.next;   
    }
    public ListNode insert(ListNode list, int k){
        ListNode new_node = new ListNode(k);
        new_node.next = null;

        if(list == null){
            list = new_node;
        }else{
            ListNode last = list;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    
}
