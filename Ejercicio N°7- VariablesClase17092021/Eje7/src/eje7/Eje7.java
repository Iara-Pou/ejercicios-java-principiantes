package eje7;

public class Eje7 {

    public static void main(String[] args) {
        //inicializo variables que se repiten para que sea más ordenado
        int A, B, C, D, N, X, Y;
        double a, n, m;
        char primer;
        String resultado, positivoNegativo, parImpar, multiplo5, multiplo10, compa;
         System.out.println(".............. TRABAJO N°7 ...............");
         System.out.println("..........................................\n");
         System.out.println("EJERCICIO 1 ..............................\n");

        // 1ER EJERCICIO
        N = 399;
        a = 2.5;
        primer = 'W';
        //mostrar valores de las variables
        System.out.println(".................................................");
        System.out.println("El valor de la primera variable (N) es " + N + ".");
        System.out.println("El valor de la segunda variable (A) es " + a + ".");
        System.out.println("El valor de la tercera variable (C) es " + primer + ".");
        System.out.println(".................................................");

        //suma entre N y a
        double suma = N + a;
        System.out.println("N + A= " + suma + ".");
        //resto A y N
        double resta = a - N;
        System.out.println("A - N= " + resta + ".");
        //valor numérico de c
        int cambioC = (int) primer;
        System.out.println("El valor de C en enteros es " + cambioC + ".\n\n");
 System.out.println("EJERCICIO 2 ..............................\n");


        //2DO EJERCICIO
        X = 20; 
        Y = 292;
        n = 2.266;
        m = 3.555;

        System.out.println("---------------VALORES-----------------");
        System.out.println("El valor de X es " + X + ("."));
        System.out.println("El valor de Y es " + Y + ("."));
        System.out.println("El valor de N es " + N + ("."));
        System.out.println("El valor de M es " + m + ("."));
        System.out.println("-----------------------------------------");

        System.out.println("-----------------------------------------");
        int suma1 = X + Y;
        System.out.println("El resultado de X + Y es " + suma1 + ("."));
        int resta1 = X - Y;
        System.out.println("El resultado de X - Y es " + resta1 + ("."));
        int multi1 = X * Y;
        System.out.println("El resultado de X * Y es " + multi1 + ("."));
        int divi1 = X / Y;
        System.out.println("El resultado de X / Y es " + divi1 + ("."));
        int resto1 = X % Y;
        System.out.println("El resto de X / Y es " + resto1 + ("."));
        System.out.println("-----------------------------------------");

        double suma2 = N + m;
        System.out.println("El resultado de N + M es " + suma2 + ("."));
        double resta2 = N - m;
        System.out.println("El resultado de N - M es " + resta2 + ("."));
        double multi2 = N * m;
        System.out.println("El resultado de N multiplicado por M es " + multi2 + ("."));
        double divi2 = N / m;
        System.out.println("El resultado de N dividido M es " + divi2 + ("."));
        double resto2 = N % m;
        System.out.println("El resto de N / M es " + resto2 + ("."));
        System.out.println("-----------------------------------------");

        double suma3 = X + N;
        System.out.println("El resultado de X + N es " + suma3 + ("."));
        double divi3 = Y / m;
        System.out.println("El resultado de Y / M es " + divi3 + ("."));
        double resto3 = Y % m;
        System.out.println("El resto de Y / M es " + resto3 + ("."));
        
        System.out.println("--------VARIABLES DUPLICADAS-------------");
        A = X * 2;
        System.out.println("X . 2 es " + A + ("."));
        B = Y * 2;
        System.out.println("Y . 2 es " + B + ("."));
        double c2 = m * 2;
        System.out.println("M . 2 es " + c2 + ("."));
        double d = N * 2;
        System.out.println("N . 2 es " + d + ("."));

        System.out.println("---------VARIABLES SUMADAS-------------");
        double e = X + Y + m + N;
        System.out.println("La suma de todas las variables es igual a " + e + ("."));

        System.out.println("---------VARIABLES PRODUCTO------------");
        double f = X * Y * m * N;
        System.out.println("El producto de todas las variables es igual a " + f + (".\n\n"));

 System.out.println("EJERCICIO 3 ..............................\n");


//3ER EJERCICIO
        A = 5;
        B = 67;
        C = 22;
        D = 10;
        
        System.out.println("..............................");
        System.out.println("Variables originales..........");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        System.out.println("..............................");
        System.out.println("Variables intercambiadas......");

        A = (A = D);
        System.out.println("Ahora A es igual a " + A);
        B = (B = C);
        System.out.println("Ahora B es igual a " + B);
        C = (C = A);
        System.out.println("Ahora C es igual a " + C);
        D = (D = B);
        System.out.println("Ahora D es igual a " + D +".\n\n");

        System.out.println("EJERCICIO 4 ..............................\n");

        //4TO EJERCICIO
        A = 49;
        B = A % 2;
        System.out.println("A es " + A + ".");

        //operador condicional
        resultado = (B == 0) ? "par" : "impar";
        //par o impar
        System.out.println("A es un numero " + resultado + ".\n\n");

 System.out.println("EJERCICIO 5 ..............................\n");

        //5TO EJERCICIO
        B = -15;
        System.out.println("B es " + B + ".");

        resultado = (B > 0) ? "positivo" : "negativo";
        System.out.println("B es " + resultado + ".\n\n");

 System.out.println("EJERCICIO 6 ..............................\n");

        //6TO EJERCICIO
        C = 20;
        System.out.println("C = " + C);

        positivoNegativo = (C >= 0) ? "positivo" : "negativo";
        System.out.println("C es " + positivoNegativo + ("."));

        D = C % 2;
        parImpar = (D == 0) ? "par" : "impar";
        System.out.println("C es " + parImpar + ("."));

        int E = C % 5;
        multiplo5 = (E == 0) ? "es múltiplo de cinco" : " no es múltiplo de cinco";
        System.out.println("C " + multiplo5 + ("."));

        int F = C % 10;
        multiplo10 = (F == 0) ? "es múltiplo de diez" : "no es múltiplo de 10";
        System.out.println("C " + multiplo10 + ("."));

        compa = (C > 100) ? "es mayor a 100" : "es menor a 100";
        System.out.println("C es " + compa + (".\n"));

         System.out.println("..................................");

    }

}
