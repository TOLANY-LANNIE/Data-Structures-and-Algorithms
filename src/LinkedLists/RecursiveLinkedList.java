package LinkedLists;

public class RecursiveLinkedList {
    static Node head;

    public RecursiveLinkedList(){
        this.head = null;
    }

    //Node class
    private static class Node{
        private int data;
        private Node next;

        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }

    // Function to insert a new node at the
// end of linked list using recursion.
    static Node insertEnd(Node head, int data)
    {
        // If linked list is empty, create a
        // new node (Assuming newNode() allocates
        // a new node with given data)
        if (head == null){
            head = new Node(data);
            return head;
        }
            // If we have not reached end, keep traversing
            // recursively.
        else
            head.next = insertEnd(head.next, data);
        return head;
    }

    static void traverse(Node head)
    {
        if (head == null)
            return;

        // If head is not null, print current node
        // and recur for remaining list
        System.out.print( head.data + "-> ");

        traverse(head.next);
    }
    static boolean contains(Node head, int target){
        if(head ==null) return false;

        if(head.data==target) return true;

        return contains(head.next,target);
    }
    static int sumList(Node head){
        /* // iterative solution
        int sum =0;
        Node curr = head;
        while (curr!=null){
            sum+=curr.data;
            curr =curr.next;
        }*/

        //recursively
        if(head==null) return 0;
        return head.data + sumList(head.next);
    }

    static Node delete(Node head, int target){
        if(head.data==target) {
            return head.next;
        }

        Node prev = null;
        Node curr = head;

         while(curr!= null){
             if(curr.data ==target){
                 //delete node
                 prev.next = curr.next;
             }
             prev = curr;
             curr = curr.next;
         }
         return head;
    }

    static Node deleteRecursively(Node head, int target){

        // If linked list is empty
        if (head == null)
            return null;

        // Base case (start needs to be deleted)
        if (head.data == target)
        {
            Node res = head.next;
            return res;
        }

        head.next = deleteRecursively(head.next, target);
        return head;
    }
    static Node deleteNode(Node start, int position )
    {
        if (position == 0){ return start.next; }
        start.next = deleteNode(start.next, position-1);
        return start;
    }

    static Node reserveLinkedList(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return  head;
    }
    static Node reserveLinkedListRecursive(Node head){
        if(head == null) {
            return head;
        }

        // last node or only one node
        if(head.next == null) {
            return head;
        }

        Node newHeadNode = reserveLinkedListRecursive(head.next);

        // change references for middle chain
        head.next.next = head;
        head.next = null;

        // send back new head node in every recursion
        return newHeadNode;
    }
    public static void reversePrint(Node llist) {
        // Write your code here
        if(llist== null) return;
        else{
            reversePrint(llist.next);
            System.out.println(llist.data);
        }
    }
    public static Node insertNodeAtPosition(Node llist, int data, int position){
        Node node = new Node(data);
        if(position==0){
            node.next = llist.next;
            llist=node;
        }else{
            Node aux = new Node(0);
            aux.next = llist;
            for(int i=0;i<position;i++)aux=aux.next;
            node.next = aux.next;
            aux.next=node;
        }

        return llist;
    }
    // Driver code
    public static void main(String args[])
    {
        Node head = null;
        head = insertEnd(head, 6);
        head = insertEnd(head, 8);
        head = insertEnd(head, 10);
        head = insertEnd(head, 12);
        head = insertEnd(head, 14);
        head = insertEnd(head, 10);
        traverse(head);

        //System.out.println("\n Contains "+contains(head,12));
        //System.out.println("\n Sum "+sumList(head));
        //deleteRecursively(head, 15);
        System.out.println("\n=========================");
        //deleteNodeNth(head,3);
        reversePrint(head);
        //traverse(head);



    }
}
