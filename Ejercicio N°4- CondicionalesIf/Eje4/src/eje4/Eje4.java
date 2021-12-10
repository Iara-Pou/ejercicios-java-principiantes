package eje4;

public class Eje4 {

    public static void main(String[] args) {
        //Variables en común.
        int temperatura;
        boolean haceSol, nevado;

        // 1ER EJERCICIO
        temperatura = 27;
        if (temperatura > 25) {
            System.out.println("A la playa!");
        }

        // 2DO EJERCICIO
        haceSol = true;
        if (haceSol == true) {
            System.out.println("No te olvides la sombrilla.");
        }

        // 3ER EJERCICIO
        haceSol = true;
        nevado = true;
        if (nevado == true || haceSol == true) {
            System.out.println("Que bien!");
        }

        // 4TO EJERCICIO
        nevado = true;
        temperatura = 29;
        if (nevado == true && temperatura >= 20 && temperatura <= 30) {
            System.out.println("No me lo creo...");
        }

        // 5TO EJERCICIO
        temperatura = 32;
        haceSol = true;
        if (temperatura < 0 || temperatura > 30) {
            if (haceSol == true) {
                System.out.println("Mejor me quedo en casa.");
            }
        }

        // 6TO EJERCICIO
        temperatura = 32;
        if (temperatura > 25) {
            System.out.println("A la playa!");
        }

        //7MO EJERCICIO
        temperatura = 10;
        if (temperatura <= 25) {
            System.out.println("Esperando al buen tiempo...");
        }

        //8VO EJERCICIO
        temperatura = 10;
        if (temperatura > 25) {
            System.out.println("A la playa.");
        } else {
            System.out.println("Esperando al buen tiempo...");
        }

        //9NO EJERCICIO
        temperatura = 10;
        nevado = true;

        if (temperatura > 25) {
            System.out.println("A la playa");
        } else if (temperatura > 15) {
            System.out.println("A la montaña!");
        } else if (temperatura < 5 && nevado == true) {
            System.out.println("A esquiar!");
        } else {
            System.out.println("A dormir");
        }

    }

}
