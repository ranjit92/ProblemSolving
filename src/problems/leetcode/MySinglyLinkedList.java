package problems.leetcode;

public class MySinglyLinkedList {

	static class Node{
        int val;
        Node next;
       
       Node(int val){
           this.val = val;
       }
    }
    
    Node head;

    /** Initialize your data structure here. */
    public MySinglyLinkedList() {
        head = null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        
        
        if(head != null){
           
            Node node = head;
            int count = 0; 
            while(node !=null){
                if(count == index){
                    return node.val;
                    
                }
                count++;
                node = node.next;
            }
        }
        return -1;
        
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        
        Node node = new Node(val);
        
        node.next = head;
        
        head = node;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        
        Node node = new Node(val);
        if(head == null){
            head = node;
           
        }
        else{
            Node temp = head;
            
            while(temp.next !=null){
                temp = temp.next;
            }
            
            temp.next = node;
        }
        
        printList();
        
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        
        if(index ==0){
           addAtHead(val);
            return;
        }
            
        
        
        Node node = new Node(val);
        int count =0;
        Node temp = head;
        
        for(int i=0; temp!=null && i < index-1; i++){
            temp = temp.next;
        }
        
        if(temp ==null){
            return;
        }
        
        node.next =  temp.next;
        temp.next = node;
       
        
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        
        //delete at head
        if(index == 0){
            head = head.next;
            return;
        }
        

        Node temp = head;
        
        
        for(int i = 0; temp !=null && i < index-1; i++){
             temp = temp.next;
        }
            
            if(temp == null || temp.next == null){
                return;
            }
            
         temp.next = temp.next.next;
         
        
    }
    
    public void printList(){
        
        Node temp = head; 
        while(temp !=null){
            System.out.print(temp.val +" > ");
            temp = temp.next;
        } 
        
        System.out.println();
    }
}
