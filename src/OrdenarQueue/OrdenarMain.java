/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenarQueue;

import CircularArray.CircularArrayQueue;

/**
 *
 * @author PC
 */
public class OrdenarMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrdenarClasse oc = new OrdenarClasse();
        CircularArrayQueue<Integer> c1 = new CircularArrayQueue();
        c1.enqueue(1);
        c1.enqueue(2);
        c1.enqueue(3);
        CircularArrayQueue<Integer> c2 = new CircularArrayQueue();
        c2.enqueue(4);
        c2.enqueue(5);
        c2.enqueue(6);
        oc.ordenarQueue(c1, c2);
        
    }
    
}
