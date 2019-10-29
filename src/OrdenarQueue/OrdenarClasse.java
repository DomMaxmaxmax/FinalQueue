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
        
        int[] temp = new int[c1.size()];
        int[] temp2 = new int[c2.size()];
        int[] ftemp = new int[c1.size() + c2.size()];
        int iterator = 0;
        if(c1.size() == 0){
            throw new NullPointerException("Queue Vazia");
        }else{
        for(int i=0 ; i<c1.size() ; i++){
            temp[i] = c1.first();
            c1.dequeue();
        }
        for(int j=0 ; j<c2.size() ; j++){
            temp2[j] = c2.first();
            c2.dequeue();
        }
        
        for(int k = 0; k<c1.size(); k++){
            ftemp[k] = temp[k];
            iterator++;
        }
        for(int m = 0; m<c2.size();m++){
            ftemp[iterator] = temp2[m];
            iterator++;
        }
        
        for(int x=0 ; x<temp2.length; x++){
            caq.enqueue(ftemp[x]);
        }
        }
        
        System.out.println(caq.toString());
        
        
        
        
        

    }


}
    
    

