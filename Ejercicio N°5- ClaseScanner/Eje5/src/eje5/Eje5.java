package eje5;

import java.util.Scanner;

public class Eje5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        //inicializar variables
        String nombre, apellido;
        int DNI, añoDeNacimiento;

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
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + DNI);
        System.out.println("Año de nacimiento: " + añoDeNacimiento);
        System.out.println("Edad: " + edad + " iaeaños");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

    }

}
