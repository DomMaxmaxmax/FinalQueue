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
        int cont1 = 0;
        int cont2 = 0;
        if(c1.size() == 0){
            throw new NullPointerException("Queue 1 Vazia");
        }else{
        if(c2.size() == 0){
            throw new NullPointerException("Queue 2 Vazia");
        }
        for(int i=0 ; i<c1.size() ; i++){
            temp[i] = c1.dequeue();
            cont1++;
        }
        for(int j=0 ; j<c2.size() ; j++){
            temp2[j] = c2.dequeue();
            cont2++;
        }
        
        for(int k = 0 ; k<cont1 ; k++){
            ftemp[k] = temp[k];
            iterator++;
        }
        for(int m = 0 ; m<cont2 ; m++){
            ftemp[iterator] = temp2[m];
            iterator++;
        }
        
        for(int x=0 ; x<cont2+cont1; x++){
            caq.enqueue(ftemp[x]);
        }
        }
        
        System.out.println(caq.toString());
        
        
        
        
        

    }


}
    
    

