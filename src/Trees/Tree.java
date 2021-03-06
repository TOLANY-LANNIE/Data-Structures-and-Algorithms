package Trees;


import LinkedLists.RecursiveLinkedList;

public class Tree {
    //Node class
    private static class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int val){
            this.data = val;
            this.left= null;
            this.right = null;
        }
    }

    static Node insert(Node root, int val){
        Node newNode =  new Node(val);
        if(root == null){
            root = newNode;
            return root;
        }
        if(newNode.data<=root.data){
            if(root.left == null){
                root.left = newNode;
            } else {
                root.left = insert(root.left,val); //recursive
            }
        }else if(newNode.data>=root.data){
            if(root.right == null){
                root.right = newNode;
            } else {
                root.right = insert(root.right,val);//recursive
            }
        }
        return root;
    }
    static boolean contains(Node root,int val){
        if(val ==root.data) return true;
        else if(val<=root.data){
            if(root.left ==null){
                return false;
            }else{
                return contains(root.left,val);
            }
        }
        else{
            if(root.right ==null){
                return false;
            }else{
                return contains(root.right,val);
            }
        }
    }
    static void printInorder(Node root){
        if (root.left!=null) printInorder(root.left);
        System.out.println(root.data);
        if (root.right!=null) printInorder(root.right);
    }
    static void printPreOrder(Node root){
        System.out.println(root.data);
        if (root.left!=null) printInorder(root.left);
        if (root.right!=null) printInorder(root.right);
    }
    static void printPostOrder(Node root){
        if (root.left!=null) printInorder(root.left);
        if (root.right!=null) printInorder(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        Node root =null;
        root =insert(root, 10);
        root =insert(root, 5);
        root =insert(root, 15);
        root =insert(root, 18);
        root =insert(root, 8);
        printPreOrder(root);
        System.out.println("----------------------------");
        printInorder(root);
        System.out.println("----------------------------");
        printPostOrder(root);
        int find = 34;
        System.out.println("Contains "+find+": "+contains(root,find));




    }
}
