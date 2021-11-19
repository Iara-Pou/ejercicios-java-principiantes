package ejen13;
import javax.swing.JOptionPane;

public class EjeN13 {
    /*A)Crear una aplicación, que permita el ingreso de 2 números, para luego 
    calcular la suma, resta, división, multiplicación, división y residuo.
Mostrar y solicitar valores utilizando JOPTIONPANE
     */
    public static void main(String[] args) {
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
    }
    
}
