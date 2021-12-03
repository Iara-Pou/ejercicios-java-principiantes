package trabajofinaliarapou;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class TrabajoFinalIaraPou {

    public static void main(String[] args) {

        //logo
        ImageIcon marca = new ImageIcon("src/fotos/images.png");

        JOptionPane.showMessageDialog(null, "¡Bienvenido a ClickSeguros! "
                + "\nTu mejor opción", "ClickSeguros", JOptionPane.QUESTION_MESSAGE, marca);

        //datos
        String nomApe = JOptionPane.showInputDialog(null, "Por favor, ingrese su nombre y apellido", "ClickSeguros", JOptionPane.QUESTION_MESSAGE);
        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, ingrese su teléfono", "ClickSeguros", JOptionPane.QUESTION_MESSAGE));
        String email = JOptionPane.showInputDialog(null, "Por favor, escriba su E-mail", "ClickSeguros", JOptionPane.QUESTION_MESSAGE);

        //datos del auto
        String modelo = "";
        String[] marcas = {"Audi", "BMW", "Chevrolet", "Ford", "Fiat", "Kia"};

        // ELEGIR MARCA
        int marcaElegida = JOptionPane.showOptionDialog(null, "Seleccione la marca de su auto", "ClickSeguros",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                marca, marcas, "");

        modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo de su auto", "ClickSeguros", JOptionPane.QUESTION_MESSAGE);
        String dominio = JOptionPane.showInputDialog(null, "Ingrese el dominio de su auto", "ClickSeguros", JOptionPane.QUESTION_MESSAGE);
        int año = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuándo fue fabricado?", "ClickSeguros", JOptionPane.QUESTION_MESSAGE));

        //calculo cuota antiguedad
        int antiguedad = 2021 - año;
        int extra = 0;

        if (antiguedad <= 5 && antiguedad >= 0) {
            extra = 500;
        } else {
            if (antiguedad <= 10) {
                extra = 1000;
            } else {
                if (antiguedad <= 15) {
                    extra = 1500;
                } else {
                    if (antiguedad <= 20) {
                        extra = 2000;
                    } else {
                        if (antiguedad >= 20) {
                            JOptionPane.showMessageDialog(null, "Lo sentimos, no podemos asegurar tu auto", "ClickSeguros", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        }

        //sigue o no el programa
        if (extra != 0) {

            //opciones de seguro
            Object[] cobertura = {"Terceros Completos", "Todo Riesgo ", "Responsabilidad Civil"};
            int[] precios = {3000, 2000, 1000};
            
            JOptionPane.showMessageDialog(null, "En Click Seguros, ofrecemos tres tipos de cobertura: \n\n"
                    + ">Terceros completos: con un valor de $3000 \n>Todo riesgo: con un valor de $3000"
                    + "\n>Responsabilidad Civil: con un valor de $1000 ", "ClickSeguros", JOptionPane.QUESTION_MESSAGE, marca);
           
            int coberturaElegida = JOptionPane.showOptionDialog(null, "¿Qué tipo de cobertura prefiere?", "ClickSeguros",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    marca, cobertura, "");

            int extra2 = precios[coberturaElegida];

       //EXTRA3 COBERTURAS ADICIONALES
            JOptionPane.showMessageDialog(null, "Además, ofrecemos coberturas adicionales: \n\n"
                    + ">Cada cobertura tiene un valor de $300\n\nHoy tenemos 2X1 en adicionales,\n¡Aproveche!", "ClickSeguros", JOptionPane.QUESTION_MESSAGE);

            int siNo = 0;
            int contador = 0;
            String [] adicionales = {"Granizo", "Llantas deportivas", "Asistencia Mecánica", "Localizador GPS"};
            String [] adicionalesCliente = {" "," "," "," "};

            siNo = JOptionPane.showConfirmDialog(null, "¿Busca alguna cobertura adicional?",
                    "ClickSeguros", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            while (siNo == 0 && contador < 4) {

                Object elegido1 = JOptionPane.showInputDialog(null, "¿Qué cobertura busca?", "ClickSeguros", JOptionPane.QUESTION_MESSAGE, null, adicionales, adicionales[0]);
                String elegido = (String) elegido1;

                //guardo los adicionales del cliente en vector
                if (elegido.equals(adicionalesCliente[0]) || elegido.equals(adicionalesCliente[1])
                            || elegido.equals(adicionalesCliente[2]) || elegido.equals(adicionalesCliente[3])) {
                    JOptionPane.showMessageDialog(null, "Ya sumó anteriormente esa cobertura.", "ClickSeguros", JOptionPane.WARNING_MESSAGE);
                } else {
                    adicionalesCliente[contador] = elegido;
                    JOptionPane.showMessageDialog(null, "Sumó la cobertura " + elegido + ".", "ClickSeguros", JOptionPane.INFORMATION_MESSAGE);
                        contador++;
                    }
                
            siNo = JOptionPane.showConfirmDialog(null, "¿Busca sumar otra cobertura adicional?",
                        "ClickSeguros", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE); 
            }

            //calcula promo
            int extra3 = contador+1 * 300;
            if (contador%2 == 0) {
                extra3 = (extra3 / 2);
            }

            //cálculo cuota final
            int cuota = extra + extra2 + extra3;

            //mostrar datos
            JOptionPane.showMessageDialog(null, "¡Gracias por su compra!\n\nDATOS DEL CLIENTE:\n"
                    + ">Cliente: " + nomApe + "\n>Teléfono: " + telefono + " \n>E-mail: " + email + " \n\nDATOS DEL VEHÍCULO ASEGURADO:"
                    + "\n>Marca:" + marcaElegida + "\n>Modelo: " + modelo + "\n>Patente: " + dominio + "\n>Año de fabricación: " + año + ""
                    + "\n\n<COBERTURA SELECCIONADA> " + cobertura[coberturaElegida] + " \n<ADICIONALES DE COBERTURA>" + adicionalesCliente[0]+ "  "+
                    adicionalesCliente[1]+ "  "+ adicionalesCliente[2]+ "  "+ adicionalesCliente[3] + " \n<VALOR FINAL> " + cuota, "ClickSeguros", JOptionPane.INFORMATION_MESSAGE, marca);

        }

}

}

