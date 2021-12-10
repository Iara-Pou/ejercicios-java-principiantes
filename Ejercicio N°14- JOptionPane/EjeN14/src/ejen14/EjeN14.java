
package ejen14;

import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class EjeN14 {
    
    public static void main(String[] args) {
        /* el productor de seguros solicita: Nombre, Apellido, Marca del 
vehículo (Tener un listado de marcas y cada marca identificarla con una gama)
Año del vehículo Y Dominio del vehículo*/
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre"
                + "", "1,2,3 SEGUROS", JOptionPane.QUESTION_MESSAGE);

        String apellido = JOptionPane.showInputDialog(null,"Ingrese su apellido"
                + "", "1,2,3 SEGUROS", JOptionPane.QUESTION_MESSAGE);   
        String [] opciones= {"Ford", "Toyota", "Renault", "Ferrari", "Tesla"};

        int marca = JOptionPane.showOptionDialog(null, "Seleccione la marca de su auto"
        + "", "1,2,3 SEGUROS", 0, JOptionPane.PLAIN_MESSAGE, null , opciones, "Ford");
        int año = Integer.parseInt (JOptionPane.showInputDialog(null,"Ingrese el año de su auto"
        + "", "1,2,3 SEGUROS", JOptionPane.QUESTION_MESSAGE));   
        String dominio = JOptionPane.showInputDialog(null,"Ingrese el dominio de su vehículo"
        + "", "1,2,3 SEGUROS", JOptionPane.QUESTION_MESSAGE);   
         
/* En base a la gama establecer el precio y sumarle el año dependiendo en que margen se encuentra.
Alta gama agregar $1800 cuota final;
MEDIA BAJA agregar $890 cuota final;*/     
String gama ="";
int adicional = 0;
int adicional2 = 0;

switch (marca){
      case 1: 
          gama = "media";
          break;
      case 2: 
          gama = "media";
          break;   
      case 3: 
          gama = "baja";
          break;
      case 4: 
          gama = "alta";
          break;
      case 5: 
          gama = "alta";
          break;       
    }
if(gama=="alta"){
    adicional = 1800;
} else {
    adicional = 890;}

/*// Crear una función
- si el año se encuentra entre 1990-1999 = $ 480;
- si el año se encuentra entre 2000-2010 = $ 780;
- si el año se encuentra entre 2011-2016 = $ 950;
- si el año se encuentra entre 2017-2020 = $ 1200;
- SI NO SE ENCUENTRA EN LOS RANGOS MENCIONADOS = $ 350 */
if (1900<=año&& año<=1999){
adicional2= 480;
}else{
if(2000<=año&& año<=2010){
adicional2= 780;
}else{
if(2011<=año&& año<=2016){
adicional2 = 950;
}else{
if(2017<=año&& año<=2020){
adicional2 = 1200;
} else {
adicional2 = 350;}}}}


int adicionalTotal = adicional2 + adicional; 
/*
crear un Joption final resultado de toda la cotización o imprimir en consola con 
formato de cotización (Datos de la compañía + datos cargados y calculados del sistema )
*/
JOptionPane.showMessageDialog(null, "CLIENTE: "+ nombre + " "+ apellido + "\nDATOS DEL VEHÍCULO: "
        + "\n   >MARCA: "+ marca +         "\n   >GAMA: "+ gama + "\n   >DOMINIO: "
        + dominio + "\n   >AÑO: " + año +
        "\n   >IMPORTE ADICIONAL: " + adicionalTotal, "1,2,3 SEGUROS", JOptionPane.QUESTION_MESSAGE);
    }
            }       
