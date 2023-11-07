/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tap_u3_ejemplo6_tirodedados;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cuent
 */
public class Jugador3 extends Thread{
    Ventana v;
    int t1 = 0,t2 = 0;

    public Jugador3(Ventana v) {
        this.v = v;
        
    }
    
    public void run(){
        while(true){
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            if(v.turnoj == 3){
                t1=(int) (Math.random()*6)+1;
                t2=(int) (Math.random()*6)+1;
                
                v.jTextPane3.setText("Dado 1 = " + t1 + "\n"+
                        "Dado 2 = " + t2 + "\n" +
                        "Total = " +(t1 + t2));
                
                v.turnoj++;
            }
            
        }
    
    
    }
    public int Total(){
        return t1 + t2;
    }
    
    
    
    
}
