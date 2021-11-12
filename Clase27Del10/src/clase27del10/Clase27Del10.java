package clase27del10;
/*Se solicita hacer un sistema para sacar turnos en un centro de servicios 
para el automovil.
se debe solicitar al clientes :
    -Nombre del Clientes, DNI y dominio del vehículo
Solicitar al cliente permitir seleccionar:
Cambio de neumáticos
Cambio de aceite
Pastillas de frenos 
Alineación 
Balanceo
Imprimir el turno al cliente con detalle con los servicios seleccionados 
y la información del cliente  */
import java.util.Scanner; 
public class Clase27Del10 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        System.out.println("<<<< ¡Bienvenido a Concesionaria López! >>>>");
        System.out.println("Por favor, ingrese los siguientes datos:");
        System.out.print("Su nombre:");
        String nombre = leer.nextLine();
        System.out.print("Su DNI:");
        int DNI = leer.nextInt();
        leer.nextLine();
        System.out.print("La patente de su vehículo:");
        String patente = leer.nextLine();
        
        System.out.println("\n¡Muchas gracias! Ahora, ¿Qué servicio está buscando?");
        System.out.println(">Cambio de neumáticos (PRESIONE 1)");
        System.out.println(">Cambio de aceite (PRESIONE 2)");
        System.out.println(">Pastillas de frenos (PRESIONE 3)");
        System.out.println(">Alineación (PRESIONE 4)");
        System.out.println(">Balanceo (PRESIONE 5)");
        int servicio = leer.nextInt();
        String ser = "";
        
        switch (servicio){
            case 1:  
                ser = "Cambio de neumáticos";
                break;
            case 2:  
                ser = "Cambio de aceite";
                break;
            case 3:
                ser = "Pastillas de frenos";
                break;
            case 4:
                ser = "Alineación";
                break;
            case 5:
                ser = "Balanceo";
                break;
            default: 
                ser = "no seleccionó ninguno";
                break;
        }

        System.out.println("CLIENTE "+ nombre+ "-----------------");
        System.out.println("DNI: "+ DNI);
        System.out.println("PATENTE: "+ patente);
        System.out.println("-------------------------------------");
        System.out.println("Servicio requerido: "+ ser + ".");
        

       
        
        
        
        
    }
    
}
