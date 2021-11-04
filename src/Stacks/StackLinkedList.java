package Stacks;


public class StackLinkedList {
    private static StackNode top;
    private static int size;

    //Node class
    private static class StackNode{
        private int data;
        private StackNode next;

        public StackNode(int val){
            this.data = val;
            this.next = null;
        }
    }
    private StackLinkedList(){
        this.top = null;
        this.size = 0;
    }

    static void push(int data){
        if(size== 0){
            top = new StackNode(data);
        }else{
            StackNode pushedNode = new StackNode(data);
            pushedNode.next = top;
            top = pushedNode;
        }
        size++;
    }
    static int pop(){
        if(size ==0){
            System.out.println("Stack Empty ");
            return Integer.MIN_VALUE;
        }
        StackNode popped = top;
        top = top.next;
        size--;
        return popped.data;
    }
    static int peek(){
       return top.data;
    }

    static boolean isEmpty(){
        if (top == null) {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(1);
        stack.push(45);
        stack.push(121);
        stack.push(11);

        System.out.println("Initial Size:"+ size);
        System.out.println(stack.pop()+ " popped from stack");
        System.out.println("Size:"+ size);
        System.out.println(stack.pop()+ " popped from stack");
        System.out.println("Size:"+ size);
        System.out.println(stack.pop()+ " popped from stack");
        System.out.println("Size:"+ size);
        System.out.println(stack.pop()+ " popped from stack");
        System.out.println("Size:"+ size);
        System.out.println(stack.pop()+ " popped from stack");
        System.out.println("Size:"+ size);
        //System.out.println("Top element is " + stack.peek());
        //System.out.println("Size:"+ size);

    }
}
