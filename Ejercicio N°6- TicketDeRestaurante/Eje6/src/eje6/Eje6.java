package eje6;

import java.util.Scanner;

public class Eje6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //ingresar datos: nombre del mozo, total de lo consumido, modalidad de pago
        System.out.println("-------SISTEMA LA FRAGATA-------");
        System.out.print("Ingrese el nombre del mozo: ");
        String mozo = leer.nextLine();
        System.out.print("¿Cuál es el monto total? ");
        int monto = leer.nextInt();
        leer.nextLine();
        System.out.println("¿Cual es la modalidad de pago seleccionada? ");
        System.out.println("crédito (ingrese 1), débito (ingrese 2) o efectivo (ingrese 3)");
        int modo = leer.nextInt();
        System.out.println("---------------------------");

        int porcentaje = 0, resultado = 0;
        String fin = "";
        //switch: modalidad de pago calcular descuento
        switch (modo) {
            case 1:
                porcentaje = 30 * monto / 100;
                resultado = monto - porcentaje;
                fin = porcentaje + "% de descuento";
                break;
            case 2:
                porcentaje = 10 * monto / 100;
                resultado = monto - porcentaje;
                fin = porcentaje + "% de descuento";

                break;
            case 3:
                porcentaje = 10 * monto / 100;
                resultado = monto + porcentaje;
                fin = porcentaje + "% adicionales";
            default:
                resultado = 0;
        }

        //mostrar datos
        if (resultado != 0) {
            System.out.println("--BIENVENIDO A LA FRAGATA--");
            System.out.println("---------------------------");
            System.out.println("Mozo = " + mozo);
            System.out.println("Monto total = " + monto);
            System.out.println("Modo de pago = " + modo);
            System.out.println("---------------------------");
            System.out.println("PORCENTAJE DE DIFERENCIA= " + fin);
            System.out.println("PRECIO FINAL = " + resultado);
            System.out.println("--------------------------");
            System.out.println("¡Gracias por su compra!");
        } else {
            System.out.println("Por favor, vuelva a seleccionar la forma de pago");
        }

    }

}
