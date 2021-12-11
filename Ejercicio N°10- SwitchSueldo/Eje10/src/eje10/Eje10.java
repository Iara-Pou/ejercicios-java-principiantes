package eje10;

import java.util.Scanner;
public class Eje10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //pido datos
        System.out.println("Por favor, ingrese su nombre:");
        String nombre = leer.nextLine();
        System.out.println("Por favor, ingrese su apellido:");
        String apellido = leer.nextLine();
        System.out.println("Por favor, ingrese su fecha de nacimiento (ej: 01/11/2000)");
        String fechaDeNac = leer.nextLine();
        System.out.println("¿Hace cuántos años trabaja en la empresa?");
        int años = leer.nextInt();
        System.out.println("¿En qué área de la empresa trabaja?");
        String area = leer.nextLine();
        leer.nextLine();
        System.out.println("¿Cuál es su salario actual? (Ingrese el valor sin comas).");
        int sueldo = leer.nextInt();
        System.out.println("Ingrese su categoría (¿A, B, C O D?):");
        char cate = leer.next().charAt(0);

        /* Nota : los datos deben solicitarse o darle opción a que los seleccione 
A = 18%, B = 12%, C = 9% y D = 6% */
        int aumento = 0;
        int salario = 0;
        switch (cate) {
            case 'A':
                aumento = 18;
                salario = (aumento * sueldo) / 100 + sueldo;
                break;
            case 'B':
                aumento = 12;
                salario = (aumento * sueldo) / 100 + sueldo;
                break;
            case 'C':
                aumento = 9;
                salario = (aumento * sueldo) / 100 + sueldo;
                break;
            case 'D':
                aumento = 6;
                salario = (aumento * sueldo) / 100 + sueldo;
                break;
            default:
                salario = 0;
                break;
        }

        //muestro 1ros datos
        System.out.println("........<DATOS DEL EMPLEADO>.........");
        System.out.println("NOMBRE: " + nombre);
        System.out.println("APELLIDO: " + apellido);
        System.out.println("FECHA DE NACIMIENTO: " + fechaDeNac);
        System.out.println("ÁREA EMPRESARIAL: " + area);
        System.out.println("AÑOS DE ANTIGUEDAD: " + años);
        System.out.println("SUELDO ACTUAL: " + sueldo);
        System.out.println(".....................................");
        if (salario != 0) {
            System.out.println("CATEGORÍA: " + cate);
            System.out.println("PORCENTAJE DE AUMENTO: " + aumento + ("%."));
            System.out.println("SALARIO CON AUMENTO: " + salario + (" pesos."));
        } else {
            System.out.println("La categoría que eligió no es válida. Elija A, B, C o D.");
        }
        System.out.println(".....................................");

    }

}
