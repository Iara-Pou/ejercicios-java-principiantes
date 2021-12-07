package eje16;

import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Eje16 {

    public static void main(String[] args) {
        ImageIcon foto = new ImageIcon("src\\eje16\\banco-patagonia-sa.jpg");

        String usuario = "Iara", contra = "P123";
        String usuarioIng, contraIng;

        int i = 0;
        int plataSaldo = 100000;
        int servicio = 0;

        //loguear
        do {
            JOptionPane.showMessageDialog(null, "¡BIENVENIDO A BANCO PATAGONIA!\nPor favor, ingrese a su cuenta", "Banco Patagonia", JOptionPane.INFORMATION_MESSAGE, foto);

            usuarioIng = JOptionPane.showInputDialog(null, "Usuario: ", "Banco Patagonia", JOptionPane.QUESTION_MESSAGE);
            contraIng = JOptionPane.showInputDialog(null, "Contraseña: ", "Banco Patagonia", JOptionPane.QUESTION_MESSAGE);
            System.out.println("");
        } while (!usuario.equals(usuarioIng) || !contra.equals(contraIng));

        if (i == 3 && (!usuario.equals(usuarioIng) || !contra.equals(contraIng))) {
            System.out.println("Acceso denegado ¡Intente más tarde!");
        } else {
            System.out.println("Acceso permitido ¡Bienvenido!");
        }

        //bienvenida y servicios
        JOptionPane.showMessageDialog(null, "¡Bienvenido al cajero automático!", ""
                + "Banco Patagonia", JOptionPane.QUESTION_MESSAGE, foto);

        do {
            servicio = Integer.parseInt(JOptionPane.showInputDialog(null, "¿EN "
                    + "QUÉ SERVICIO ESTÁ INTERESADO?\n------------------------"
                    + "-----------------------------"
                    + "\n   1. Saldo \n   2. Transferir\n   3. Retirar\n   "
                    + "4. Cambiar clave\n   "
                    + "5. Salir\n----------------------------------------------"
                    + "-------", "Banco Patagonia", JOptionPane.QUESTION_MESSAGE));

            switch (servicio) {
                case 1:
                    saldo(plataSaldo);
                    break;
                case 2:
                    plataSaldo = transacciones(plataSaldo, usuario);
                    break;
                case 3:
                    plataSaldo = retiro(plataSaldo, foto, usuario);
                    break;
                case 4:
                    contra = cambioClave (usuario, contra, foto);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "¡Gracias por confiar en nosotros!", ""
                            + "Banco Patagonia", JOptionPane.QUESTION_MESSAGE, foto);
                    break;
            }

        } while (servicio != 5);

    }

    
    
    //MÓDULO 1
    public static void saldo(int plataSaldo) {
        ImageIcon foto = new ImageIcon("src\\eje16\\banco-patagonia-sa.jpg");
        JOptionPane.showMessageDialog(null, "Su saldo es de " + plataSaldo + " pesos.", "Banco "
                + "Patagonia", JOptionPane.QUESTION_MESSAGE, foto);
    }

    
    
    // MÓDULO 2
    public static int transacciones(int plataSaldo, String usuario) {
       
        int longitud = 0, contador = 0;

        while (contador != 3 && longitud != 16) {
            String CBUdes = JOptionPane.showInputDialog(null, "Ingrese el CBU del destinatario", "Banco Patagonia",
                    JOptionPane.QUESTION_MESSAGE);

            longitud = CBUdes.length();
            if (longitud == 16) {

                JOptionPane.showMessageDialog(null, "CBU válido", "Banco Patagonia", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El CBU ingresado tiene más o menos de 16 dígitos.\n"
                        + "Por favor, intente de vuelta", "Banco Patagonia", JOptionPane.ERROR_MESSAGE);
                contador++;
            }
        }
        if (contador != 3) {
            int importeTrans = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "¿Cuánto quiere transferir?", "Banco Patagonia", JOptionPane.QUESTION_MESSAGE));
            if (importeTrans > plataSaldo) {
                JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente para realizar la "
                        + "transferencia.\nIngrese un monto menor. ", "Banco Patagonia", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "¡Transferencia completa!", "Banco Patagonia",
                        JOptionPane.INFORMATION_MESSAGE);
                System.out.println("--------- BANCO PATAGONIA ---------\n--------- TRANSACCIONES ---------\n   Usuario: " + usuario + ""
                        + "\n   Saldo inicial: " + plataSaldo + "\n   Transacción: $ " + importeTrans
                        + "\n   CBU transferido: ");
                plataSaldo = (plataSaldo - importeTrans);
                System.out.println("Saldo final: $ " + plataSaldo);

            }

        }
        return plataSaldo;
    }

    
    
    //MÓDULO 3
    public static int retiro(int plataSaldo, ImageIcon foto, String usuario) {

        String montos[] = {"200", "500", "1000", "2000"};
        int retiro = JOptionPane.showOptionDialog(null, "Elija el monto a retirar:", "Banco Patagonia",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                foto, montos, "");

        switch (retiro) {
            case 0:
                retiro = 200;
                break;
            case 1:
                retiro = 500;
                break;
            case 2:
                retiro = 1000;
                break;
            case 3:
                retiro = 2000;
                break;
            default:
                retiro = 0;
                break;
        }

        System.out.println("--------- BANCO PATAGONIA ---------\n-------------- RETIRO -------------\n   Usuario: " + usuario + ""
                + "\n   Saldo inicial: " + plataSaldo + "\n   Retira: $ " + retiro);
        plataSaldo = plataSaldo - retiro;
        System.out.println("Saldo final: $ " + plataSaldo);

        return plataSaldo;
    }

    
    
    //MÓDULO 4
    public static String cambioClave (String usuario, String contra,ImageIcon foto){
        
        String [] canales = {"HOME BANKING","Clave telefónica","Cajero"};
        Object canalElegido = JOptionPane.showOptionDialog(null, "Elija por donde realizar el cambio de clave:", "Banco Patagonia",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, canales, "");
        
        String contraNueva = JOptionPane.showInputDialog(null, "¿Cuál quiere que sea su nueva contraseña?", "Banco Patagonia", JOptionPane.QUESTION_MESSAGE);
        if (contraNueva.equals(contra)) {
        JOptionPane.showMessageDialog(null, contra+ " ya es su contraseña. \nIngrese una nueva, por favor.", "Banco Patagonia", JOptionPane.ERROR_MESSAGE);
        }else{
        JOptionPane.showMessageDialog(null, "¡Listo! Ahora su contraseña es "+ contraNueva+ ".", "Banco Patagonia", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("--------- BANCO PATAGONIA ---------\n--------- CAMBIO DE CLAVE ---------\n   Usuario: " + usuario + ""
        + "\n   Contraseña inicial: " + contra + "\n   Contraseña nueva: " + contraNueva+ "\n   Canal: " +canalElegido );
        }
        
    return contra;    
    }
    
}
