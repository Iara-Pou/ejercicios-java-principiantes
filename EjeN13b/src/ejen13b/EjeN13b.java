/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejen13b;

/*
B)Ingrese por teclado el puntaje de un alumno que ha postulado a la Universidad, 
visualice un mensaje “Alumno Ingresado” si el puntaje obtenido es mayor a 500.
Solicitar nombre del alumno y tres notas (hacer promedio)
Mostrar y solicitar valores utilizando JOPTIONPANE
 */
import javax.swing.JOptionPane;
public class EjeN13b {

    public static void main(String[] args) {
        //ejercicio de ingreso
        //CARTEL PARA PEDIR NOMBRE, CARTEL PARA PEDIR PUNTAJE
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
