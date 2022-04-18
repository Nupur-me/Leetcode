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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l3 = null;
	ListNode p1 = list1, p2 = list2, p3 = l3;

	while(p1 != null && p2 != null) {
		if(p1.val <= p2.val) {
			ListNode newNode = new ListNode(p1.val);
			if(l3 == null) {
				l3 = newNode;
			} else {
				p3.next = newNode;
			}
			p3 = newNode;
			p1 = p1.next;
		} else {
			ListNode newNode = new ListNode(p2.val);
			if(l3 == null) {
				l3 = newNode;
			} else {
				p3.next = newNode;
			}
			p3 = newNode;
			p2 = p2.next;
		}
	}

	while(p1 != null) {
		ListNode newNode = new ListNode(p1.val);
		if(l3 == null) {
			l3 = newNode;
		} else {
			p3.next = newNode;
		}
		p3 = newNode;
		p1 = p1.next;
	}

	while(p2 != null) {
		ListNode newNode = new ListNode(p2.val);
		if(l3 == null) {
			l3 = newNode;
		} else {
			p3.next = newNode;
		}
		p3 = newNode;
		p2 = p2.next;
	}

	return l3;
    }
}