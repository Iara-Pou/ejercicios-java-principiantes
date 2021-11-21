package eje12;

import java.util.Scanner;

public class Eje12 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String usuario = "Nala";
        String contra = "perro";
        String usuarioIng, contraIng;
        int i = 0;

        //Pedir datos
        do {
            System.out.println("Por favor, ingrese los siguientes datos");
            System.out.print("USUARIO: ");
            usuarioIng = leer.nextLine();
            System.out.print("CONTRASEÑA: ");
            contraIng = leer.nextLine();
            i++;

        } //comparar datos
        while (usuario.equals(usuarioIng) && contra.equals(contraIng) || i == 3);

        if(i==3){
            System.out.println("Acceso denegado ¡Intente más tarde!");
        }
        else
        {
            System.out.println("Acceso permitido ¡Bienvenido!");

        }
        
        
        }
    }

