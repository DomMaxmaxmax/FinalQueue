/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenarQueue;

import CircularArray.CircularArrayQueue;
import java.util.Arrays;
import java.util.Collections;


/**
 *
 * @author PC
 */
public class OrdenarClasse {
    
    CircularArrayQueue<Integer> caq = new CircularArrayQueue<>();

    public OrdenarClasse() {
    }
    
    public void ordenarQueue(CircularArrayQueue<Integer> c1, CircularArrayQueue<Integer> c2){
        
        int[] temp = null;
        int[] temp2 = null;
        int[] ftemp = null;
        for(int i=0 ; i<c1.size() ; i++){
            temp[i] = c1.dequeue();
        }
        Arrays.sort(temp);
        for(int j=0 ; j<c2.size() ; j++){
            temp2[j] = c2.dequeue();
        }
        Arrays.sort(temp2);
        
        System.arraycopy(temp2, 0, temp, temp.length, temp2.length);
        
        Arrays.sort(temp2);
        for(int x=0 ; x<temp2.length; x++){
            caq.enqueue(temp[x]);
        }
        
        System.out.println(caq.toString());
        
        
        
        
        

    }


}
    
    

