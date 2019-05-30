package primeiroswing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PrimeiroSwing extends JFrame {
    public PrimeiroSwing() { 
        setSize(300,200); //largura,altura
    } 
    public static void main(String[] args) { 				
        SwingUtilities.invokeLater(new Runnable(){ 
            @Override 
            public void run(){ 
                    PrimeiroSwing pp;
                    pp = new PrimeiroSwing(); 	
                    pp.setVisible(true); 
            } 
        }); 
    }  
    
}
