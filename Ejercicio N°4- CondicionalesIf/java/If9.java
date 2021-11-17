public class If9 {
    public static void main(String[] args) {
        // TODO code application logic here
   //declaro la temperatura
   int temperatura = 10;
   //declaro nevado como boolean porque si no no se compila
   boolean nevado=true;
   //if primero
   if (temperatura>25){
        System.out.println("A la playa");
   } 
   //if anidado
   else if( temperatura>15 ){
       System.out.println("A la montaña!");
   } 
   //otro if anidado
   else if(temperatura<5 && nevado==true ){
        System.out.println("A esquiar!");}else{
        System.out.println("A dormir");
   }
   }
   }


    

