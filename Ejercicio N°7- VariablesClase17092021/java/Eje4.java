/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Eje4 {

    /**
A continuación muestra un mensaje indicando si A es par o impar. 
Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
    */
    public static void main(String[] args) {
        // TODO code application logic here
   int A = 49;
   int B = A % 2;
   String resultado; 

    //operador condicional
    resultado = (B == 0)? "par" : "impar" ;
    //par o impar
    System.out.println("A es un numero "+ resultado + ".");
    }
    
}
