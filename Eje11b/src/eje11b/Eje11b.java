package eje11b;
/*b)Realizar un programa utilizando WHILE que  le pida al usuario un valor 
inicial y un valor final por consola, e incrementemos el valor inicial dado 
hasta el tope establecido, mostrando el valor de la variable contadora en cada 
iteración.
Imprimir en consola cada resultado.*/
import java.util.Scanner; 
public class Eje11b {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor inicial");
        int i = leer.nextInt();
        System.out.println("Ingrese un valor final");
        int f = leer.nextInt();
        
        System.out.println("................................");
        System.out.println("Su valor inicial es " + i);
        
        while(i < f-1){
        int resultado = i+=1;
        System.out.println(resultado);
        };
        
        System.out.println("Su valor final es " + f);
        System.out.println("................................");     
        
    }      
        
    }
    

