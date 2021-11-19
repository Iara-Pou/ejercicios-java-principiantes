package eje11c;
import java.util.Scanner;

public class Eje11c {

    public static void main(String[] args) {
        /*c)Utilizar do while y realizar un programa de login . 
          La contraseña y usuario deben estar guardados en el mismo programa.*/
    
    Scanner leer = new Scanner (System.in);
    System.out.println("--------------------------INGRESO----------------------------- ");
  
    String usuario= "";
    String contra= "";
    
    do{
    System.out.print("Usuario: ");
    usuario = leer.nextLine();     
    System.out.print("Contraseña: ");
    contra = leer.nextLine();
    }while(usuario!="nala"&&contra!="perro");
        System.out.println("¡Bienvenido al sistema!");
    }
    }
