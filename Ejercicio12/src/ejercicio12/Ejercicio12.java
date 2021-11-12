package ejercicio12;
import javax.swing.JOptionPane;

public class Ejercicio12 {

    public static void main(String[] args) {
        //variables
    String contra, usuario;
    String us = "Nala";
    String con = "perro";
        for(int i=0; i<3; i++){ 
    usuario = JOptionPane.showInputDialog("USUARIO: ");
    contra = JOptionPane.showInputDialog("CONTRASEÑA: ");
    
    // if  
    if (usuario.equals(us)&&contra.equals(con)){
    JOptionPane.showMessageDialog(null,"¡Bienvenido al sistema!");
    break;
    }else{JOptionPane.showMessageDialog(null,"Usuario y/o contraseña "
                + "incorrectos. \nIntente de vuelta, Por favor.");
                }
    }
    }
}
