package Heaps;

import java.util.Arrays;
public class MinHeap {
    private int capacity =10;
    private int size =0;

    int[] items = new int[capacity];

    private int getLeftChildIndex(int parentIndex){return  2*parentIndex+1;}
    private int getRightChildIndex(int parentIndex){return  2*parentIndex+2;}
    private int getParentIndex(int childIndex){return  (childIndex-1)/2;}

    private boolean hasLeftChildIndex(int index){return  getLeftChildIndex(index)<size;}
    private boolean hasRightChildIndex(int index){return getRightChildIndex(index)<size;}
    private boolean hasParentIndex(int index){return  getParentIndex(index)>=0;}

    private int leftChildIndex(int index){return  items[getLeftChildIndex(index)];}
    private int rightChildIndex(int index){return  items[getRightChildIndex(index)];}
    private int parentIndex(int index){return  items[getParentIndex(index)];}


    private void swap(int indexOne, int indexTwo){
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo]=temp;
    }
    private void ensureExtraCapacity(){
        if(size==capacity){
            items = Arrays.copyOf(items,capacity*2);
            capacity*=2;
        }
    }
    public int peek(){
        if(size==0)throw new IllegalStateException();
        return items[0];
    }
    public int poll(){
        if(size==0)throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size-1];
        size--;
        heapifyDown();
        return item;
    }
    private void add(int item){
        ensureExtraCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    private void heapifyUp() {
        int index= size-1;
        while (hasParentIndex(index) && parentIndex(index)>items[index]){
            swap(getParentIndex(index),index);
            index = getParentIndex(index);
        }
    }

    private void heapifyDown() {
        int index= 0;
        while (hasLeftChildIndex(index)){
            int smallerChildIndex = getLeftChildIndex(index);
            if(hasRightChildIndex(index) && rightChildIndex(index)>leftChildIndex(index)){
                smallerChildIndex  =getRightChildIndex(index);
            }
            if(items[index]<items[smallerChildIndex]){
                break;
            }else{
                swap(index,smallerChildIndex);
            }
            index= smallerChildIndex;
        }
    }

    public static void main(String[] args) {
    }

}
