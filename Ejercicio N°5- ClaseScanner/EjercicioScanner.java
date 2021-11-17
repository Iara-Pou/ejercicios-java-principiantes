/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Se necesita que se realice el diagrama de flujo antes de decodificar.
Subir el proyecto a un repositorio nuevo, teniendo encuentra que el repositorio 
* se deberá llamar como el proyecto y el proyecto deberá tener el siguiente 
* estructura para identificarlo : ApellidoFechaTema (falabrino2805scanner)
En el mismo proyecto por favor incluir el diagrama de flujo.
Por favor no se olviden de darme permisos en el repositorio y agregar su 
comentario con la ruta del repositorio.
 */
//importe la clase
import java.util.Scanner; 

public class EjercicioScanner {

    public static void main(String[] args) {
        // TODO code application logic here
//declare que objeto voy a usar     
        Scanner teclado= new Scanner (System.in); 
//inicializar variables
String nombre = "", apellido="";
int DNI = 0, añoDeNacimiento= 0;

            //INGRESO DE DATOS POR CONSOLA
System.out.println("Ingrese su nombre");
nombre = teclado.nextLine();

System.out.println("Ingrese su apellido");
apellido = teclado.nextLine();

System.out.println("Ingrese su DNI");
DNI = teclado.nextInt();

System.out.println("Ingrese su año de nacimiento");
añoDeNacimiento = teclado.nextInt();

            //CALCULAR LA EDAD DEL USUARIO
int edad = 2021 - añoDeNacimiento;

            //IMPRIMIR LA INFORMACIÓN 
System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
System.out.println("Nombre:" + nombre);
System.out.println("Apellido:" + apellido);
System.out.println("DNI:" + DNI);
System.out.println("Año de nacimiento:" + añoDeNacimiento);
System.out.println("Edad:" + edad + " años");
System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");    
    
    
    
    
    
    
    }
    
}
