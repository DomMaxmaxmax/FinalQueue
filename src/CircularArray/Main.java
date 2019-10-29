/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircularArray;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircularArrayQueue<String> caq = new CircularArrayQueue();
        
        System.out.println("----- Primeiro Teste(enqueue) -----");
        caq.enqueue("Tiago");
        caq.enqueue("Joao");
        caq.enqueue("Cristiano");
        
        System.out.println(caq.toString());
        System.out.println("----- Segundo Teste(dequeue e size) -----");
        System.out.println(caq.dequeue());
        System.out.println(caq.size());
        System.out.println(caq.toString());
        System.out.println("Testes Finalizados");
        
        
    }
    
}
