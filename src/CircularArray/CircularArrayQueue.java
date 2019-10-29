/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircularArray;

import linkedqueue.QueueADT;

/**
 *
 * @author PC
 * @param <T>
 */
public class CircularArrayQueue<T> implements QueueADT<T> {
    
    private  T[] lista;
    private int count;
    private int rear, front;
    private int size;

    public CircularArrayQueue(int size) {
        this.lista = (T[])(new Object[size]);
        this.size = size;
        this.front = 0;
        this.rear = 0;
    }
    
    public CircularArrayQueue() {
        this.size = 25;
        this.lista = (T[])(new Object[25]);
        this.front = 0;
        this.rear = 0;
    }

    public T[] getLista() {
        return lista;
    }

    public void setLista(T[] lista) {
        this.lista = lista;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    @Override
    public void enqueue(T element) {
       if(count == size){
            expandCapacity();
        }else{
            lista[rear] = element;
            rear = (rear + 1) % lista.length;
            count++;
        } 
    }

    @Override
    public T dequeue() throws NullPointerException {
         
        if(count == 0){
            throw new NullPointerException("Lista Vazia");
        }
        
            T temp = lista[front];
            front = (front + 1) % lista.length;
            count--;
            
            
        return temp;
    }

    @Override
    public T first() throws NullPointerException {
        if(count == 0){
            throw new NullPointerException("Lista Vazia");
        }
        return (T) lista[front];
    }

    @Override
    public boolean isEmpty() {
        if(count == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        int tempfront = front;
        StringBuilder sb = new StringBuilder();
        while(tempfront != rear){
            sb.append(lista[tempfront]);
            sb.append("\n");
            tempfront = (tempfront + 1) % lista.length;
        }
        return sb.toString();
    }
    
    
    
    private void expandCapacity(){
       
        T[] temp = (T[]) (new Object[lista.length * 2]);
        System.arraycopy(lista, front, temp, rear, lista.length);
        lista = temp;
    }
    
}
