/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Comparator;

/**
 *
 * @author roberto
 */
public class OrdenaNomeVertice implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
        Vertice a1 = (Vertice) t;
        Vertice a2 = (Vertice)t1;
        
          if(a1.getDescricao().charAt(0)== a2.getDescricao().charAt(0)){
            return 0;
        }
        if(a1.getDescricao().charAt(0)<a2.getDescricao().charAt(0)){
        return -1;
    }else return 1;
             
    }
    
    
}
