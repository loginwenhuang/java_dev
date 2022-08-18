package com.wen.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/13 8:46
 */
public class MySinglyLinkedList<E> {

    class Node<E> {
        private E item;
        private Node next;
        Node(E item,Node next){
            this.item = item;
            this.next = next;
        }
    }
    private Node head;
    private int size;

    public void add(E element){
        Node<E> node = new Node<>(element,null);

        Node tail = getTail();

        if(tail==null){
            this.head = node;
        }else {
            tail.next = node;
        }
        size++;
    }

    public E get(int index){
        this.checkIndex(index);

        Node<E> node = this.getNode(index);

        return node.item;
    }

    public E remove(int index){
        this.checkIndex(index);

        Node<E> node = this.getNode(index);

        E item = node.item;
        if(this.head == node){
            this.head = null;
        }else {
            Node<E> temp = this.head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = node.next;
        }
        node.next=null;
        this.size--;
        return item;
    }
    /**
     *
     */
    private Node getTail(){
        if(this.head == null){
            return null;
        }
        Node n = this.head;
        while(true){
            if(n.next==null){
                return n;
            }
            n = n.next;
        }
    }
    /**
     *
     */
    private void checkIndex(int index){
        if(!(index >=0 && index < size)){
            throw new IndexOutOfBoundsException("Index:"+index+" Size:"+this.size);
        }
    }
    /**
     *
     */
    private Node getNode(int index){
        Node<E> node = this.head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}
