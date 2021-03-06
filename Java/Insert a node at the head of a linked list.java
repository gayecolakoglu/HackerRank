

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode n=new SinglyLinkedListNode(data);
    n.data=data;
    n.next=null;
    
    if(llist==null)
        return n;
    n.next=llist;
    llist=n;
    return llist;

    }

