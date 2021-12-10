/*Se necesita que al juego del vaso realizado el Viernes 22/10 se le incorpore :
- Jueguen dos participantes
-Solicitar nombre de cada uno
- Tenga tres chances cada participante
- Final muestre en pantalla puntaje y indique el ganador.
 */
package eje15;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
        
public class Eje15 {

    public static void main(String[] args) {
        
        Random RD = new Random();
        ImageIcon icon = new ImageIcon("src/Imagenes/juego.png");
        ImageIcon bien = new ImageIcon("src/Imagenes/bien.png");
        ImageIcon mal = new ImageIcon("src/Imagenes/mal.png");
        ImageIcon ganar = new ImageIcon("src/Imagenes/ganaste.png");
        ImageIcon perder = new ImageIcon("src/Imagenes/perdiste.png");
        
    //Inicio  
        JOptionPane.showMessageDialog(null, "EMPIEZA EL JUEGO", "Juego del vaso", JOptionPane.WARNING_MESSAGE, icon);
        
    //¿Cuántos juegan?
        int jugador = JOptionPane.showOptionDialog(null,"¿Cuántos juegan?","JUEGO DEL VASO",
        JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE, icon,new Object[] {"1","1 vs 1" },"");
       
    
    //dos opciones de juego    
    if (jugador==0){
    //1 jugador
        String nombre = JOptionPane.showInputDialog(null, "¿Cómo te llamás?", "JUEGO DEL "
                + "VASO", JOptionPane.PLAIN_MESSAGE);
            
        //tres repeticiones  
            int si = 0;
            for (int i=0;i<3;i++){
                
                    int seleccion = JOptionPane.showOptionDialog(null,"¿Adónde está la pelotita? ","JUEGO DEL VASO",
                    JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,
                    icon,new Object[] {"Vaso 1","Vaso 2","Vaso 3" },"Vaso 1");
        
            //logica del juego
            int pelotita = RD.nextInt(3);
                
            if (pelotita == seleccion){
                    JOptionPane.showMessageDialog(null,"¡Bien!","JUEGO DEL VASO "
                    ,JOptionPane.INFORMATION_MESSAGE,bien);
                    si ++;
                               
            }else {
                    JOptionPane.showMessageDialog(null,"¡ERROR!","JUEGO DEL VASO"
                    ,JOptionPane.INFORMATION_MESSAGE,mal);
                    } 
            }
            
        //mostrar puntaje
            if (si<=1 && si==0){
            
                //pierde    
                    JOptionPane.showMessageDialog(null, nombre+ ", tenés solo "+ si+ " puntos. \n¡PERDISTE!", "JUEGO DEL VASO",
                    JOptionPane.INFORMATION_MESSAGE, perder);} 
            
                else{  if (si<=1 && si==1){
                    JOptionPane.showMessageDialog(null, nombre+ ", tenés solo "+ si+ " punto. \n¡PERDISTE!", "JUEGO DEL VASO",
                    JOptionPane.INFORMATION_MESSAGE, perder); 
            
                //gana
                
                }else{
                    JOptionPane.showMessageDialog(null, "¡Tenés "+ si+ " puntos!\n¡ESTA VEZ GANASTE!", "JUEGO DEL VASO",
                    JOptionPane.INFORMATION_MESSAGE, ganar);}
                    }
            
    }else {
    //dos jugadores
    
        //pido nombres
        
            String nombre1 = JOptionPane.showInputDialog(null, "JUGADOR 1: ¿Cómo te llamás?", 
            "JUEGO DEL VASO", JOptionPane.QUESTION_MESSAGE);
            String nombre2 = JOptionPane.showInputDialog(null, "JUGADOR 2: ¿Cómo te llamás?", 
            "JUEGO DEL VASO", JOptionPane.QUESTION_MESSAGE);
                
            
        //JUGADOR 1
            JOptionPane.showMessageDialog(null, nombre1+ ", es tu turno!", 
                    "JUEGO DEL VASO", JOptionPane.QUESTION_MESSAGE, icon);
            int si1 = 0;
           
            //tres chances
            
                for (int a=0;a<3;a++){
                    int seleccion = JOptionPane.showOptionDialog(null,"¿Adónde está la pelotita?","JUEGO DEL VASO",
                    JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,
                    icon,new Object[] {"Vaso 1","Vaso 2","Vaso 3" },"Vaso 1");
               
                    //logica del juego
                    int pelotita2 = RD.nextInt(3);
                
                if (pelotita2 == seleccion){
                     JOptionPane.showMessageDialog(null,"Bien!","JUEGO DEL VASO"
                     ,JOptionPane.INFORMATION_MESSAGE,bien);
                     si1 ++;
                }else {
                    JOptionPane.showMessageDialog(null,"Fallaste!","JUEGO DEL VASO"
                    ,JOptionPane.INFORMATION_MESSAGE,mal);        
                }
            }
          
        //JUGADOR 2
            JOptionPane.showMessageDialog(null, nombre2+ ", ahora es tu turno!", 
            "JUEGO DEL VASO", JOptionPane.QUESTION_MESSAGE, icon);
          
            //tres chances
                int si2 = 0;
            
                for (int e=0;e<3;e++){
                     int seleccion = JOptionPane.showOptionDialog(null,"¿Adónde está la pelotita?"+ nombre2+ ":","JUEGO DEL VASO",               
                     JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,
                     icon,new Object[] {"Vaso 1","Vaso 2","Vaso 3" },"Vaso 1");
                
                //logica del juego
                          
            int pelotita3 = RD.nextInt(3);

            if (pelotita3 == seleccion){
                JOptionPane.showMessageDialog(null,"Bien!","JUEGO DEL VASO"
                ,JOptionPane.INFORMATION_MESSAGE,bien);
                si2 ++;
                }else {
                JOptionPane.showMessageDialog(null,"Fallaste!","JUEGO DEL VASO"
                    ,JOptionPane.INFORMATION_MESSAGE,mal);        
            } }

                //Gana 1, pierde 2        
            if (si1>si2){
                JOptionPane.showMessageDialog(null, nombre1+ ", ¡Ganaste con "+si1+ " puntos!" ,
                        "JUEGO DEL VASO", JOptionPane.QUESTION_MESSAGE, ganar);
                JOptionPane.showMessageDialog(null, nombre2+ ", ¡PERDISTE con "+si2+ " puntos!" ,
                        "JUEGO DEL VASO", JOptionPane.QUESTION_MESSAGE, perder);
            }else{ 
            //gana 2, pierde 1
            if(si2>si1){
                JOptionPane.showMessageDialog(null, nombre2+ ", ¡Ganaste con "+si2+ " puntos!" ,
                        "JUEGO DEL VASO", JOptionPane.QUESTION_MESSAGE, ganar);
                JOptionPane.showMessageDialog(null, nombre1+ ", ¡PERDISTE con "+si1+ " puntos!" ,
                        "JUEGO DEL VASO", JOptionPane.QUESTION_MESSAGE, perder);} 
            //empate
            else{
                JOptionPane.showMessageDialog(null,"¡Hubo un empate!" ,
                        "JUEGO DEL VASO", JOptionPane.QUESTION_MESSAGE, icon);
            
                
            }
            }
            }
            
            }
           
    }
    

 

        
        
        
  
    

    
    

