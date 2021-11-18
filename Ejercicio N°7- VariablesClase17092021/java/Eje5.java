/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Ejercicio 5
Escribe un programa java que declare una variable B de tipo entero y asígnale 
* un valor. A continuación muestra un mensaje indicando si el valor 
* de B es positivo o negativo. Consideraremos el 0 como positivo. 
* Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.

 */
public class Eje5 {

   
    public static void main(String[] args) {
        // TODO code application logic here
    int B = -15;
    String resultado;
        resultado = (B >0)? "positivo" : "negativo";
    System.out.println("B es "+ resultado + ".");
    }
    
}
