package eje3;
public class Eje3 {

    public static void main(String[] args) {
// Declaro variables
int numero1, numero2, suma, edad;
String nombre;
// Constante
final int numero_3= 4;
// Instancio numero1 y numero2
numero1 = 30;
numero2 = 40;
// Suma
suma= numero1 + numero2;
// Muestro en pantalla las dos variables y el resultado de la suma
System.out.println("--------------------------------------------");
System.out.println(">Mi primer variable es "+ numero1);
System.out.println(">Mi segunda variable es "+ numero2);
System.out.println("Las variables sumadas dan como resultado "+ suma);
System.out.println("--------------------------------------------");
// Instancio nuevos valores numero1,numero2 y vuelvo a sumar
numero1 = 100;
numero2 = 50;
//operación suma
suma = numero1 + numero2;
// Muestro en pantalla las dos variables y el resultado de la suma
System.out.println(">Primer variable nueva es "+ numero1);
System.out.println(">Segunda variable nueva es "+ numero2);
System.out.println("Las dos variables sumadas dan "+ suma);
System.out.println("--------------------------------------------");
// Instancio y muestro en pantalla la variable nombre y su edad
edad = 8;
nombre = "Carla";
System.out.println(">La edad es "+ edad);
System.out.println(">El nombre es "+ nombre);
// Muestro en pantalla la constante
System.out.println("--------------------------------------------");
System.out.println(">Mi valor constante es "+ numero_3);
System.out.println("--------------------------------------------");
}

}

