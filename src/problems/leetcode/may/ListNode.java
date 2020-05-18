package problems.leetcode.may;

public class ListNode {

	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

}

class SolutionLinkedList {
	
	/* input = 2->1->3->5->6->4->7->NULL 
	 * output = 2->3->6->7->1->5->4->NULL
	 * */
	
	
	public ListNode oddEvenList(ListNode head) {
		
		if(head == null) return null;
		
//		Separating two list one with odd head and one with even head
		ListNode odd = head;
		ListNode even = head.next;
		
//		head of initial even node that going to merge with next of odd node (odd.next = evenHead)
		ListNode evenHead = even;
		
		
		while(even !=null && even.next !=null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		
		// attaching initial even head with last node like (2->3->6->7)- odd list, (1->5->4) - even list so it will append odd list -> even list 2->3->6->7->1->5->4->NULL.
		odd.next = evenHead;   

		return head;
	}

}
