//if linked list can be modified
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        
        while(p1 != null && p2 != null){
            if(p1.val != p2.val){
                if(p1.next != null){
                    ListNode prev1 = p1;
                    p1 = p1.next;
                    prev1.next = null;
                }else{
                    return p1;
                }
                if(p2.next != null){
                    ListNode prev2 = p2;
                    p2 = p2.next;
                    prev2.next = null;
                }else{
                    return p2;
                }
            }else{
                return p1;
            }
        }
        return null;
    }
}
//if linked list cannot be modified
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
           int len1 = 0;
        int len2 = 0;
        ListNode p1=headA, p2=headB;
        if (p1 == null || p2 == null)
            return null;
 
        while(p1 != null){
            len1++;
            p1 = p1.next;
        }
        while(p2 !=null){
            len2++;
            p2 = p2.next;
        }
 
        int diff = 0;
        p1=headA;
        p2=headB;
 
        if(len1 > len2){
            diff = len1-len2;
            int i=0;
            while(i<diff){
                p1 = p1.next;
                i++;
            }
        }else{
            diff = len2-len1;
            int i=0;
            while(i<diff){
                p2 = p2.next;
                i++;
            }
        }
 
        while(p1 != null && p2 != null){
            if(p1.val == p2.val){
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
 
        return null;
    }
}
