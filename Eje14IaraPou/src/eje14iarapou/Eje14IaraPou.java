/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje14iarapou;

import javax.swing.JOptionPane;
public class Eje14IaraPou {

    public static void main(String[] args) {
        /*c)Utilizar do while y realizar un programa de login . 
          La contraseña y usuario deben estar guardados en el mismo programa.*/
    
    System.out.println("--------------------------INGRESO----------------------------- ");
  
    String usuario, contraseña;
    
    do{
    String u = JOptionPane.showInputDialog(null, "Usuario:");     
    System.out.print("Contraseña: ");
    contraseña = leer.nextLine();
    }while(u!="nala"&&contraseña!="perro");
        System.out.println("¡Bienvenido al sistema!");
      
    }
    }
    
