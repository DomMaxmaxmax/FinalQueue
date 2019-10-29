/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encoder;

import CircularArray.CircularArrayQueue;

/**
 *
 * @author PC
 */
public class EncodeClass {
    CircularArrayQueue<Integer> caq = new CircularArrayQueue<>();

    public EncodeClass() {
    }
    /**
     * 
     * Criar um Array de carateres a partir da mensagem dada.
     * Criar um array de String atraves da Key dada tirando os espaços
     * Percorrer o Array de String da Key para transformar cada String num número
     * Depois do Cast enviar esse resultado para uma queue.
     * Enviar o array de Carateres da String dada para a função finalEncode
     *  
     */
    
    public void stringProcesso(String s, String key){
        Integer temp;
        char[] temp_message = s.toCharArray();
        
        String[] keyarray = key.split(" ");
        for(int i=0; i<keyarray.length ; i++){
            temp = Integer.parseInt(keyarray[i]);
            if(temp instanceof Integer){
                caq.enqueue(temp);
            }
        }
        
        finalEncode(temp_message);
        
    }
    
    /**
     * 
     * Criar 2 inteiros para o novo char e para o valor da Key
     * Criar uma String vazia para o Resultado final
     * Criar um Charater temporário
     * Percorrer o array de Carateres dados
     * Usar a condição if para garantir que a possição no array é diferente de espaço
     * Se for espaço adicionar à String criada um espaço
     * Se não for espaço dar dequeu da Queue de Inteiros acima criada
     * Utilizar ciclo if para ver se a primeira letra é maiúscula
     * Se for maiúscula utiliza-se uma função de transformação, se não for usa-se outra
     * Pegar no valor dado na função acima e usar o cast para o transformar num Caracter
     * Adicionar o caracter a String resultante
     * Dar System.our.println na String resultante
     * 
     */
    
    private void finalEncode(char[] sf){
        int keyvalue;
        int newchar;
        char tmp;
        String result = "";
        
        for(int i=0; i<sf.length; i++){
            if(sf[i] != ' '){
                keyvalue = caq.dequeue();
                if(Character.isUpperCase(sf[i])){
                    newchar = (sf[i] + keyvalue - 65) % 26 + 65;
                } else{
                    newchar = (sf[i] + keyvalue - 97) % 26 + 97;
                }
                tmp = (char) newchar;
                result += tmp;
            }else{
                result += " ";
            }
        }
        System.out.println(result);
    }
    
}
