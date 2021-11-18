public class Eje2 {
    public static void main(String[] args) {
        // TODO code application logic here

//INSTANCIO VARIABLES
    int X= 20, Y= 292;
    double N= 2.266, M= 3.555;
//MUESTRO VALORES
    System.out.println("---------------VALORES-----------------");

    System.out.println("El valor de X es "+ X + (".") );
    System.out.println("El valor de Y es "+ Y + (".") );
    System.out.println("El valor de N es "+ N + (".") );
    System.out.println("El valor de M es "+ M + (".") );
    System.out.println("-----------------------------------------");

//CALCULOS int
    System.out.println("-----------------------------------------");

    int suma1 = X + Y;
    System.out.println("El resultado de X + Y es "+ suma1 + (".") );
    int resta1 = X-Y;
    System.out.println("El resultado de X - Y es "+ resta1 + (".") );
    int multi1 = X*Y;
    System.out.println("El resultado de X * Y es "+ multi1 + (".") );
    int divi1 = X/Y;
    System.out.println("El resultado de X / Y es "+ divi1 + (".") ); 
    int resto1 = X%Y;
    System.out.println("El resto de X / Y es "+ resto1 + (".") ); 
        System.out.println("-----------------------------------------");

//CALCULOS double
    double suma2 = N+M;
    System.out.println("El resultado de N + M es "+ suma2 + (".") );
    double resta2 = N-M;
    System.out.println("El resultado de N - M es "+ resta2 + (".") );
    double multi2 = N*M;
    System.out.println("El resultado de N multiplicado por M es "+ multi2 + (".") );
    double divi2 = N/M;
    System.out.println("El resultado de N dividido M es "+ divi2 + (".") );
    double resto2 = N%M;
    System.out.println("El resto de N / M es "+ resto2 + (".") );
        System.out.println("-----------------------------------------");

//CALCULOS INT Y DOUBLE   
    double suma3 = X + N;
    System.out.println("El resultado de X + N es "+ suma3 + (".") );
    double divi3 = Y / M;
    System.out.println("El resultado de Y / M es "+ divi3 + (".") );
    double resto3 = Y%M;
    System.out.println("El resto de Y / M es "+ resto3 + (".") );
        System.out.println("--------VARIABLES DUPLICADAS-------------");

//TODAS LAS VARIABLES DUPLICADAS
    int a= X*2;
    System.out.println("X . 2 es "+ a + (".") );
    int b= Y*2;
    System.out.println("Y . 2 es "+ b + (".") );
    double c= M*2;
    System.out.println("M . 2 es "+ c + (".") );
    double d= N*2;
    System.out.println("N . 2 es "+ d + (".") );
//sumar todas las variables
        System.out.println("---------VARIABLES SUMADAS-------------");

double e = X + Y + M + N;
    System.out.println("La suma de todas las variables es igual a "+ e + (".") );
//multiplicar todas las variables entre sí
        System.out.println("---------VARIABLES PRODUCTO------------");

double f = X * Y * M * N;
    System.out.println("El producto de todas las variables es igual a "+ f + (".") );
    
            System.out.println("-----------------------------------------");

         

    
    }
    
}
