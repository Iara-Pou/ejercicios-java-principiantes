
package Eje11a;
public class Eje11 {

    public static void main(String[] args) {
       /* a) Incrementar una variable entera de valor 1 mientas sea menor o igual 
        a 100, mostrando el valor actual de esta en cada iteración. 
        Utilizando estructura FOR/WHILE/DOWHILE */
    
System.out.println("Números del 1 al 100 usando FOR");
for(int i= 1; i<=100; i++){
System.out.print(i+ " ");}
System.out.println("");

int a= 0;
System.out.println("Números del 1 al 100 usando DO/WHILE");

do{
a++;
System.out.print(a+" ");
}while(a<100);
System.out.println("");


int b= 0;
System.out.println("Números del 1 al 100 usando WHILE");
while(b<100){
b++;
System.out.print(b+ " " );
}

    }    
                }
   