package LinkedLists;



public class Linkedlist {
    Node head;
    public Linkedlist(){
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
    // Method to insert a new node
    public static Linkedlist insert(Linkedlist list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node curr = list.head;
            while (curr.next != null) {
                curr = curr.next;
            }

            // Insert the new_node at last node
            curr.next = new_node;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(Linkedlist list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + "->");

            // Go to next node
            currNode = currNode.next;
        }
    }



    //check if val is in the linkedlist
    private static boolean contains(Linkedlist list, int target){
        Node currNode = list.head;
        // Traverse through the LinkedList
        while (currNode != null) {
            // Go to next node
            if(currNode.data ==target) return true;

            currNode = currNode.next;
        }
        return false;
    }
    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        Linkedlist list = new Linkedlist();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        printList(list);




        // Print the LinkedList
       // printList(list);
        System.out.println(contains(list, 4));
    }
}
