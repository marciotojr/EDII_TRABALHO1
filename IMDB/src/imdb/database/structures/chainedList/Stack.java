/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imdb.database.structures.chainedList;

/**
 *
 * @author Marcio Júnior
 */
public class Stack<E> {

    public SingleLinkedNode head;
    int size;

    public Stack() {
        head = null;
        size = 0;
    }

    public void push(E value) {
        if (value != null) {
            SingleLinkedNode newNode = new SingleLinkedNode(value);
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }

    public E pop() {
        if (head == null) {
            return null;
        }
        SingleLinkedNode returnValue = head;
        head = head.getNext();
        returnValue.setNext(null);
        size--;
        return (E) returnValue.getValue();
    }

    public int getSize() {
        return size;
    }
    
    public E[] toArray(){
        Object[] arr = new Object[size];
        SingleLinkedNode node = head;
        int i=0;
        while(node!=null){
            arr[i]=node.getValue();
            node=node.getNext();
            i++;
        }
        return (E[]) arr;
    }
}
