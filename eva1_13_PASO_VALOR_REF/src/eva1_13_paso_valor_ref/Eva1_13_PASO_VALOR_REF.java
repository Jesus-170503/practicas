/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_paso_valor_ref;

/**
 *
 * @author moviles
 */
public class Eva1_13_PASO_VALOR_REF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int valorPrueba = 100;
        System.out.println("Valor = " + valorPrueba);
        incVal(valorPrueba);
        System.out.println("Valor incrementado = " + valorPrueba);
        
        
        //----------------------------------
        PruebaValor prueba = new PruebaValor();
        prueba.x=100;
        System.out.println("Valor = " + prueba.x);
        incVal(prueba);
        System.out.println("Valor incrementado = " + prueba.x);
    }
    
    public static void incVal(int valor){  //Argumento se le llama 
    valor++;
    }
    public static void incVal(PruebaValor pruebaValor){  //Argumento se le llama 
    pruebaValor.x++;
    }
    
}


class PruebaValor{
    int x;
}