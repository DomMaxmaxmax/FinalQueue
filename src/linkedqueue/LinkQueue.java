/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedqueue;

/**
 *
 * @author PC
 * @param <T>
 */
public class LinkQueue<T> implements QueueADT<T> {
    private int count;
    private LinearNode<T> front, rear;

    public LinkQueue() {
        this.count = 0;
        this.front = null;
        this.rear = null;
    }

    @Override
    public void enqueue(T element) {
        LinearNode<T> node = new LinearNode(element);
        if (front == null) {
            front = node;
            rear = node;
            count++;
        } else {
            rear.setNext(node);
            rear = rear.getNext();
            count++;

        }
        
    }

    @Override
    public T dequeue() throws NullPointerException{
        LinearNode<T> temp = front;
        if(front == null){
            throw new NullPointerException("Lista Vazia");
        }else{
            front = front.getNext();
            temp.setNext(null);
            count--;
        }
        return (T) temp.getElement();
    }

    @Override
    public T first() throws NullPointerException{
        if(front == null){
            throw new NullPointerException("Lista Vazia");
        }
        return (T) front.getElement();
    }

    @Override
    public boolean isEmpty() {
        if(front != null){
            return false;
        }else{
            return true;
        }
        
    }

    @Override
    public int size() {
        return count;
        
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        LinearNode<T> f = front;
        while(f != null){
            sb.append(f.getElement());
            sb.append("\n");
            f = f.getNext();
        }
        return sb.toString();
        
    }
}


