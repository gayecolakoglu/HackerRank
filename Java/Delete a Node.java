

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        
        if (head == null) 
            return head; 
  
        SinglyLinkedListNode temp = head; 
  
        if (position == 0) 
        { 
            head = temp.next;   
            return head; 
        } 
  
        for (int i=0; temp!=null && i<position-1; i++) 
            temp = temp.next; 
  
        if (temp == null || temp.next == null) 
            return head; 
  
       
        SinglyLinkedListNode next = temp.next.next; 
  
        temp.next = next;
        return head;
       
    }

