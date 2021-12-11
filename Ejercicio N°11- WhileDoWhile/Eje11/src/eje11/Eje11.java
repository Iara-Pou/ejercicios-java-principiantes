package eje11;

import java.util.Scanner;

public class Eje11 {

    public static void main(String[] args) {

        /* a) Incrementar una variable entera de valor 1 mientas sea menor o igual 
        a 100, mostrando el valor actual de esta en cada iteración. 
        Utilizando estructura FOR/WHILE/DOWHILE */
        System.out.println("PARTE A -------------------------------------------");
        
        System.out.println("    Números del 1 al 100 usando FOR");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        int a = 0;
        System.out.println("    Números del 1 al 100 usando DO/WHILE");

        do {
            a++;
            System.out.print(a + " ");
        } while (a < 100);
        System.out.println("");

        int b = 0;
        System.out.println("    Números del 1 al 100 usando WHILE");
        while (b < 100) {
            b++;
            System.out.print(b + " ");
        }
        System.out.println("\n");

        /*b)Realizar un programa utilizando WHILE que  le pida al usuario un valor 
inicial y un valor final por consola, e incrementemos el valor inicial dado 
hasta el tope establecido, mostrando el valor de la variable contadora en cada 
iteración.
Imprimir en consola cada resultado.*/
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("PARTE B -------------------------------------------");
        
        System.out.println("Ingrese un valor inicial");
        int i = leer.nextInt();
        System.out.println("Ingrese un valor final");
        int f = leer.nextInt();

        System.out.println("................................");
        System.out.println("Su valor inicial es " + i);

        while (i < f - 1) {
            int resultado = i += 1;
            System.out.println(resultado);
        }

        System.out.println("Su valor final es " + f);
        System.out.println("................................\n");

        /* c)Utilizar do while y realizar un programa de login . La contraseña y usuario deben 
estar guardados en el mismo programa. */
        System.out.println("PARTE C -------------------------------------------");

        String usuario = "Nala";
        String contra = "perro";
        String usuarioIng, contraIng;
        i = 0;

        //Pedir datos
        do {
            System.out.println("Por favor, ingrese los siguientes datos\n");
            System.out.print("USUARIO: ");
            usuarioIng = leer.next();
            System.out.print("CONTRASEÑA: ");
            contraIng = leer.next();
        } //comparar datos
        while (!usuario.equals(usuarioIng) || !contra.equals(contraIng));

        System.out.println("¡Bienvenido al sistema!");

    }

}
