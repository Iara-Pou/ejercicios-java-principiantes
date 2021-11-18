/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Eje6 {

    public static void main(String[] args) {
        // TODO code application logic here
        int C = 20;
        System.out.println("C = " + C);

        String positivoNegativo;
        positivoNegativo = (C >= 0)? "positivo" : "negativo" ;
        System.out.println("C es " + positivoNegativo + ("."));
        
        String parImpar;
        int D = C % 2;
        parImpar = (D == 0)? "par" : "impar" ;
        System.out.println("C es " + parImpar + ("."));

        String multiplo5;
        int E = C % 5;
        multiplo5 = (E == 0)? "es múltiplo de cinco" : " no es múltiplo de cinco" ;
        System.out.println("C " + multiplo5 + ("."));
        
        String multiplo10;
        int F = C% 10;
        multiplo10 = (F == 0)? "es múltiplo de diez" : "no es múltiplo de 10";
        System.out.println("C "+ multiplo10 + ("."));
        
        String compa;
        compa = (C > 100)?"es mayor a 100":"es menor a 100";
        System.out.println("C es "+ compa +("."));
    }
    
}
