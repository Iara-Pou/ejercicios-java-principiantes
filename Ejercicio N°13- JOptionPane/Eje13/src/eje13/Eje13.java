package eje13;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Eje13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //pido datos
        System.out.println("PRIMER EJERCICIO");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");

         // EJE A
        int a= 0;
        int b= 0;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su primer "
                + "número:", "Calculadora +, -, : Y .", JOptionPane.QUESTION_MESSAGE));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su segundo "
                + "número:", "Calculadora +, -, : Y .", JOptionPane.QUESTION_MESSAGE));
        int suma = a+b;
        int resta = a-b;
        int multi = a*b;
        int div = a/b;
        JOptionPane.showMessageDialog(null, "Sus resultados: \n>SUMA = "+ suma + "\n>RESTA = "+ resta+"\n>MULTIPLICACIÓN = "
                + multi + "\n>DIVISIÓN = "+ div, "Calculadora +, -, * Y /", JOptionPane.PLAIN_MESSAGE);
        
        System.out.println("SEGUNDO EJERCICIO");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");

// segunda parte
        //ejercicio de ingreso
        //CARTEL PARA PEDIR PUNTAJE
        int puntos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu "
                + "puntaje obtenido", "INGRESANTES UBA 2021", JOptionPane.PLAIN_MESSAGE));
        //CARTEL QUE MUESTRE SI INGRESÓ O NO
        if(puntos>500){
        JOptionPane.showMessageDialog(null, "¡Felicidades, entraste a la carrera!", "INGRESANTES "
                + "UBA 2021", JOptionPane.INFORMATION_MESSAGE);
        }else{
        JOptionPane.showMessageDialog(null, "Lo sentimos, pero no entraste a la carrera.", "INGRESANTES "
                + "UBA 2021", JOptionPane.ERROR_MESSAGE);
        //ejercicio del promedio
        
        System.out.println("TERCER EJERCICIO");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");

        //CARTEL PARA PEDIR EL NOMBRE, CARTEL PARA PEDIR LAS TRES NOTAS
        String nombre = JOptionPane.showInputDialog(null, "PROMEDIOS DON BOSCO", "Ingrese"
                + " su nombre:", JOptionPane.QUESTION_MESSAGE);
        int nota1 = Integer.parseInt (JOptionPane.showInputDialog(null, "PROMEDIOS DON BOSCO", "Ingrese"
                + " su primer nota:", JOptionPane.QUESTION_MESSAGE));
        int nota2 = Integer.parseInt (JOptionPane.showInputDialog(null, "PROMEDIOS DON BOSCO", "Ingrese"
                + " su segunda nota:", JOptionPane.QUESTION_MESSAGE));
        int nota3 = Integer.parseInt (JOptionPane.showInputDialog(null, "PROMEDIOS DON BOSCO", "Ingrese"
                + " su tercer nota:", JOptionPane.QUESTION_MESSAGE));
        //calculo de promedio
        int promedio = ( nota1 + nota2 + nota3 )/3;
        //CARTEL PARA MOSTRAR EL PROMEDIO
        JOptionPane.showMessageDialog(null, nombre+ ": tu "
                + "promedio es de " + promedio+ " puntos." ,"PROMEDIOS DON BOSCO", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
