package iarapoueje9;
import java.util.Scanner;

public class IaraPouEje9 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        //pido datos
        System.out.println("DATOS GENERALES-------------------");  

        System.out.print("Nombre del alumno: ");  
        String nombre = teclado.nextLine();
        System.out.print("Fecha de nacimiento (xx/xx/xxxx): ");  
        String nac = teclado.nextLine();
        System.out.print("DNI del alumno: ");
        int DNI = teclado.nextInt();
        
        System.out.println("INGRESO DE CALIFICACIONES---------");  
        //armo vectores
        String nombreMat [] = new String [3];
        int primerNota [] = new int [3];
        int segundaNota [] = new int [3];
        int tercerNota [] = new int [3];
        int promedio [] = new int [3];
        //pido notas y nombre
        for(int i=0; i<nombreMat.length; i++){
        System.out.print(i+1 +">MATERIA:");
        nombreMat[i] = teclado.nextLine();
        System.out.print(">NOTA 1er trimestre:");
        primerNota [i] = teclado.nextInt();
        teclado.nextLine();
        System.out.print(">NOTA 2do trimestre:");
        segundaNota [i] = teclado.nextInt();
        teclado.nextLine();
        System.out.print(">NOTA 3er trimestre:");
        tercerNota [i] = teclado.nextInt();
        teclado.nextLine();
        promedio [i] = (primerNota[i]+segundaNota[i]+tercerNota[i])/3;
        
        }
        //Muestro datos generales
        System.out.println("---------DATOS GENERALES----------");  
        System.out.println("ALUMNO: " + nombre);  
        System.out.println("FECHA DE NACIMIENTO: " + nac);
        System.out.println("DNI: " + DNI);
        //muestro datos de los vectores
        System.out.println("-------------MATERIAS-------------"); 
        for (int a=0; a<promedio.length; a++){
        System.out.println("1-"+ nombreMat [a]+ ": ");
        System.out.println("PROMEDIO: " + promedio[a]);
        }
        





        
    }
    
}
