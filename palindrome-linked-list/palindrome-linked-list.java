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
    
    public boolean isPalindrome(ListNode head) {
        
        ListNode fast = head, slow = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
        // odd nodes
    if (fast != null) { 
        slow = slow.next;
    }
    slow = reverse(slow);
    fast = head;
    
    while (slow != null) {
        if (fast.val != slow.val) {
            return false;
        }
        fast = fast.next;
        slow = slow.next;
    }
    return true;
}

public ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
        

}
}

// TLE
//       if(head==null){
//           return false;
//       } 
        
//         ListNode start = head;
//         ListNode mid = middle(head);
//         ListNode rev = reverse(mid);
        
//         while(start != null){
            
//             if(start.val == mid.val){
//                 start = start.next;
//                 mid = mid.next;
//                 return true;
//             }
//         }
            
//        return false;
//     }
    
//     public ListNode middle(ListNode head){
        
//         ListNode slow = head;
//         ListNode fast = head;
        
//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         if(fast != null) slow = slow.next;
       
//         return slow;
//     }
    
//     public ListNode reverse(ListNode mid){
        
//         ListNode temp;
//         ListNode prev = null;
//         ListNode curr = mid;
        
//         while(curr != null){
            
//             temp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = temp;
//         }
        
//         return prev;





