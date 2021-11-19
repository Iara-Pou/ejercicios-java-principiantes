/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11c;
import java.util.Scanner;
public class Main {
  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String usuario = "Nala";
        String contra = "perro";
        String usuarioIng,contraIng;
        int i=0;
        
        //Pedir datos
        do{
        System.out.println("Por favor, ingrese los siguientes datos");
        System.out.print("USUARIO:");
        usuarioIng = leer.nextLine();
        System.out.print("CONTRASEÑA:");
        contraIng = leer.nextLine();
        }       //comparar datos
        while(!usuario.equals(usuarioIng) || !contra.equals(contraIng));
        
        
        System.out.println("¡Bienvenido al sistema!");
        
        
    }
    
}
