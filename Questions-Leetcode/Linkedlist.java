class LinkedList {
    Node head;
  
    
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        } // Constructor
    }
  
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList llist = new LinkedList();
  
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
  
        
  
        llist.head.next = second; 
  
        second.next
            = third; // Link second node with the third node
  
        
    }
}
