/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedqueue;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkQueue<String> lq = new LinkQueue();
        
        System.out.println("----- Primeiro Teste(enqueue) -----");
        System.out.println(" ");
        lq.enqueue("Tiago");
        lq.enqueue("Joao");
        lq.enqueue("Cristiano");
        System.out.println(lq.toString());
        System.out.println("----- Segundo Teste(dequeue) -----");
        System.out.println(" ");
        lq.dequeue();
        System.out.println(lq.toString());
        System.out.println("----- Terceiro Teste(size e first) -----");
        System.out.println(" ");
        System.out.println(lq.size());
        System.out.println(lq.first());
        System.out.println(" ");
        System.out.println("----- Quarto Teste(isempty) -----");
        System.out.println(" ");
        System.out.println(lq.isEmpty());
        System.out.println(" ");
        
     }
    
}
