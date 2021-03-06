

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
     static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    SinglyLinkedListNode n = new SinglyLinkedListNode(data);
    n.data = data;
    n.next = null;
    
    if(head == null){
        head = n;
        return head;
    }
    
    else
    {
        SinglyLinkedListNode c = head;
        while(c.next != null){
            c = c.next;
        }
        
        c.next = n;
        
        return head;
        
    }
        

    }

