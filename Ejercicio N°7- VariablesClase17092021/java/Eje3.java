/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Eje3 {

    /**
 A continuación
 * 
B tome el valor de C
C tome el valor de A
A tome el valor de D
D tome el valor de B     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A=5, B=67, C=22, D=10;
System.out.println("..............................");
System.out.println("Variables originales..........");
System.out.println("A = "+ A);
System.out.println("B = "+ B);
System.out.println("C = "+ C);
System.out.println("D = "+ D);
System.out.println("..............................");
System.out.println("Variables intercambiadas......");
        
A= (A = D);
System.out.println("Ahora A es igual a "+ A);
B= (B = C);
System.out.println("Ahora B es igual a "+ B);
C= (C = A);
System.out.println("Ahora C es igual a "+ C);
D= (D = B);
System.out.println("Ahora D es igual a "+ D);






System.out.println("..............................");
System.out.println("..............................");
        
        
    }
    
}
