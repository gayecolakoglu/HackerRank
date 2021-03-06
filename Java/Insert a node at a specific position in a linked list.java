

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
    newNode.data = data;
    newNode.next = null;

    if (head == null) {
        return newNode;
    }
    if (position == 0) {
        newNode.next = head;
        head = newNode;
        return head;
    }
    SinglyLinkedListNode prev = null;
    SinglyLinkedListNode current = head;
    int i = 0;
    while (current !=null && i < position) {
        prev = current;
        current = current.next;
        i++;
    }
    newNode.next = prev.next;
    prev.next = newNode;
    return head;

    }
    

