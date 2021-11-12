package ejedel1011;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class EjeDel1011 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ImageIcon unnamed = new ImageIcon ("src\\imagenes\\unnamed.jpg");
        ImageIcon si = new ImageIcon ("src\\imagenes\\descarga.png");
    String nombreApellido = JOptionPane.showInputDialog(null, "Ingrese su nombre y apellido", "BANCO GALICIA", JOptionPane.QUESTION_MESSAGE);
    int DNI = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su DNI: "));
    int sueldoMes = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingrese su sueldo mensual: ", "BANCO GALICIA"));
 
    /* Realizar un programa que calcule las cuotas de un préstamo bancario. 
Calculo: 
•	El banco presta hasta 100000 pesos siempre y cuando el sueldo del 
solicitante superé los 200000 anuales.
•	El préstamo  no debe superar a los 10 sueldos del cliente.
•	Calculo = solicitado / cuota*/
    int sueldoAño = sueldoMes*12;
        if (sueldoAño<200000){
        System.out.println("El usuario no puede acceder al prestamo");
        JOptionPane.showMessageDialog(null, "Lo sentimos, pero no puede acceder al préstamo", "BANCO GALICIA", JOptionPane.INFORMATION_MESSAGE, unnamed);
                }else{
        System.out.println("El usuario puede acceder al préstamo");
        JOptionPane.showMessageDialog(null, "¡Felicidades! Puede acceder al préstamo", "BANCO GALICIA", JOptionPane.INFORMATION_MESSAGE, unnamed);
        int monto = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingrese el préstamo requerido (HASTA 100000 PESOS): "));
        if (monto>100000){
        JOptionPane.showMessageDialog(null, "Lo sentimos, pero el monto no puede ser mayor a 100000 pesos.", "BANCO GALICIA", JOptionPane.INFORMATION_MESSAGE, unnamed);}
        else{
    int cuotas = Integer.parseInt(JOptionPane.showInputDialog
        (null, "¿En cuantas cuotas lo pagará? (hasta 12): ", "BANCO GALICIA", JOptionPane.QUESTION_MESSAGE));
    if (cuotas>12){
    JOptionPane.showMessageDialog(null, "Lo sentimos, pero no puede exceder las 12 cuotas", "BANCO GALICIA", JOptionPane.INFORMATION_MESSAGE, unnamed);
    }else{
     int cada = monto/cuotas;
    JOptionPane.showMessageDialog(null, "DATOS DE LA OPERACIÓN \n>Cliente: "+ nombreApellido
    + "\n>DNI: "+ DNI+ "\n> Monto solicitado: "+ monto+ "\n>Cantidad de cuotas: " + cuotas + "\n"
            + "IMPORTE A PAGAR POR CUOTA: "+ cada, "", JOptionPane.INFORMATION_MESSAGE, unnamed);
    JOptionPane.showMessageDialog(null, "¡Su prestamo está aprobado!", "", JOptionPane.PLAIN_MESSAGE, si);
    }
        }
        }
        }

    
    }
    

